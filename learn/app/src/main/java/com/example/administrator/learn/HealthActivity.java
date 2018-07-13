package com.example.administrator.learn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HealthActivity extends AppCompatActivity implements View.OnClickListener{

private ImageView image;
@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.health_layout);
        Button button = (Button) findViewById(R.id.button_check);
        image = (ImageView) findViewById(R.id.image_location);
        button.setOnClickListener(this);
        }

@Override
public void onClick(View view) {
        switch (view.getId())
        {
        case R.id.button_check:
        image.setImageResource(R.drawable.img_health_2);
        break;
default:
        break;
        }
        }
        }
