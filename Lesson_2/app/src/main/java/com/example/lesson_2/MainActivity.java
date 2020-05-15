package com.example.lesson_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
Button myMainButton;
TextView textView1;
EditText usernameField;
EditText passwordField;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context context = getApplicationContext();
        final CharSequence text = "Hello toast!";
        final int duration = Toast.LENGTH_SHORT;



        myMainButton = findViewById(R.id.button);
        myMainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usernameField = findViewById(R.id.usernmae);
                passwordField = findViewById(R.id.password);
                if(usernameField.toString().equals("Dima") && passwordField.toString().equals("123")){

                    textView1 = findViewById(R.id.textView);
                    textView1.setText("Logged In");


                }
                else {
                    textView1 = findViewById(R.id.textView);
                    textView1.setText("Error");

                    Toast logInfo = new Toast(context,text,duration);
                    logInfo.show();
                }
            }
        });
        }

    public void login(View view) {
    }
}


