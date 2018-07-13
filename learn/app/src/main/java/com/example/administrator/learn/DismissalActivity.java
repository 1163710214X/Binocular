package com.example.administrator.learn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class DismissalActivity extends AppCompatActivity {
   // private Queue<Student> queue = new Queue<Student>() ;
    private List<Parent> parentQueue = new ArrayList<>();
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dismissal_layout);
        generateParentQueue();

         ParentAdapter adapter = new ParentAdapter(DismissalActivity.this,R.layout.student_item,parentQueue);
         // ArrayAdapter<String> adapter = new ArrayAdapter<String>(
         //  TeacherActivity.this,android.R.layout.simple_list_item_1,data);
         ListView listView = (ListView) findViewById(R.id.list_parents);
         listView.setAdapter(adapter);
         listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                 Parent parent = parentQueue.get(i);
                 Toast.makeText(DismissalActivity.this,parent.getName()+"  LicenseNum:"+parent.getLicenseNum(),Toast.LENGTH_LONG).show();
               //  Intent intent = new Intent(DismissalActivity.this,StudentOfTeacherActivity.class);
                // startActivity(intent);
             }
         });
    }
    private void generateParentQueue()
    {
        //这里读取数据库
        Parent Emma = new Parent("Emma","AK1234");
        parentQueue.add(Emma);
        Parent Carl = new Parent("Carl","AR4353");
        parentQueue.add(Carl);
        Parent Wilson = new Parent("Wilson","CO4546");
        parentQueue.add(Wilson);


    }
}
