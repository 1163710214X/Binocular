package com.example.administrator.learn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentOfTeacherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_of_teacher_layout);
        Button button1 = (Button) findViewById(R.id.button_message);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v)
            {
                Intent intent = new Intent(StudentOfTeacherActivity.this,MessageFromParentsActivity.class);
                startActivity(intent);
            }
        });
        Button button2= (Button) findViewById(R.id.button_location);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v)
            {
                Intent intent = new Intent(StudentOfTeacherActivity.this,LocationActivity.class);
                startActivity(intent);
            }
        });
        Button button3 = (Button) findViewById(R.id.button_health);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v)
            {
                Intent intent = new Intent(StudentOfTeacherActivity.this,HealthActivity.class);
                startActivity(intent);
            }
        });

    }
}
