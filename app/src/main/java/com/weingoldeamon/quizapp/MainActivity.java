package com.weingoldeamon.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button submitButton;
    TextView textBlock;
    EditText textBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitButton = findViewById(R.id.clickButton);
        textBlock = findViewById(R.id.textBox);
        textBox = findViewById(R.id.responseEditText);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                System.out.println("Hello mom");
                Log.i("testButton","Hi dad! "+textBox.getText().toString());
                textBlock.setText(textBlock.getText().toString()+" "+textBox.getText().toString());
            }
        });
        textBox.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!hasFocus && textBox.getText().toString().equals("TJ")){
                    textBlock.setText("TJ Rocks!");
                    textBox.setText("");
                    textBox.setHint("That's a good name.");
                }
            }
        });

    }
}
