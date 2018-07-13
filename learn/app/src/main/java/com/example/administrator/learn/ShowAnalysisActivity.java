package com.example.administrator.learn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShowAnalysisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_analysis_layout);
        String str = load();
        TextView textView = (TextView) findViewById(R.id.text_analysis);
       textView.setText(str);
    }
    public String load()
    {
        FileInputStream in = null;
        BufferedReader reader = null;
        StringBuilder content = new StringBuilder();
        try{
            in = openFileInput("data");
            reader = new BufferedReader(new InputStreamReader(in));
            String line = "";
            while((line = reader.readLine())!=null)
            {
                content.append(line);
            }
        }catch (IOException e)
        {
            e.printStackTrace();
        }finally{
            if(reader !=null)
            {
                try{
                    reader.close();
                }catch (IOException e)
                {
                    e.printStackTrace();
                }

            }

        }
        return  content.toString();
    }
}
