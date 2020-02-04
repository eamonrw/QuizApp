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
    TextView displayText;
    EditText responseText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitButton = findViewById(R.id.clickButton);
        displayText = findViewById(R.id.textBox);
        responseText = findViewById(R.id.responseEditText);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                System.out.println("Hello mom");
                Log.i("testButton","Hi dad! "+ responseText.getText().toString());
                displayText.setText(displayText.getText()+" "+ responseText.getText());
            }
        });
        responseText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!hasFocus && responseText.getText().toString().equals("TJ")){
                    displayText.setText("TJ Rocks!");
                    responseText.setText("");
                    responseText.setHint("That's a good name.");
                }
            }
        });

    }
}
