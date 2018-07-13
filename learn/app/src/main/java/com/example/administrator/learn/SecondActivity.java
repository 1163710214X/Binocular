package com.example.administrator.learn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        Button button1 = (Button) findViewById(R.id.button_message);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v)
            {
                Intent intent = new Intent(SecondActivity.this,MessageActivity.class);
                startActivity(intent);
            }
        });
        Button button2= (Button) findViewById(R.id.button_location);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v)
            {
                Intent intent = new Intent(SecondActivity.this,LocationActivity.class);
                startActivity(intent);
            }
        });
        Button button3 = (Button) findViewById(R.id.button_health);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v)
            {
                Intent intent = new Intent(SecondActivity.this,HealthActivity.class);
                startActivity(intent);
            }
        });
        Button button4 = (Button) findViewById(R.id.button_analysis);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v)
            {
                Intent intent = new Intent(SecondActivity.this,AnalysisActivity.class);
                startActivity(intent);
            }
        });
    }

}
