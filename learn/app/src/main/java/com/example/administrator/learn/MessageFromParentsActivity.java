package com.example.administrator.learn;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class MessageFromParentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.message_from_parents_layout);
        final EditText editText = (EditText) findViewById(R.id.edit_toParents);
        Button button3 = (Button) findViewById(R.id.button_send);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v)
            {
                save(editText.getText().toString());
                // Intent intent = new Intent(MessageActivity.this,HealthActivity.class);
                //startActivity(intent);
            }
        });
    }
    public  void  save(String str)
    {
        FileOutputStream out = null;
        BufferedWriter writer = null;
        try{
            out = openFileOutput("data", Context.MODE_PRIVATE);
            writer = new BufferedWriter(new OutputStreamWriter(out));
            writer.write(str);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
        finally {
            try{
                if(writer !=null)
                {
                    writer.close();
                }
            }catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
