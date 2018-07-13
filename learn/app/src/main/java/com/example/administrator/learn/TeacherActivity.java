package com.example.administrator.learn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class TeacherActivity extends AppCompatActivity {
//private String[] data  ={"Tom","Ellen","Bob","Trump","Putin","Tommy","Steve","Anderson","John","Sophia","Charile"};
private List<Student> studentList = new ArrayList<>();
public List<Student> getStudentList()
{
    return studentList;
}
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teacher_layout);
         Button button4 = (Button) findViewById(R.id.button_dismissal);
         button4.setOnClickListener(new View.OnClickListener(){
             @Override
             public  void onClick(View v)
             {
                 Intent intent = new Intent(TeacherActivity.this,DismissalActivity.class);
                 startActivity(intent);
             }
         });


        initStudents();
        StudentAdapter adapter = new StudentAdapter(TeacherActivity.this,R.layout.student_item,studentList);
       // ArrayAdapter<String> adapter = new ArrayAdapter<String>(
              //  TeacherActivity.this,android.R.layout.simple_list_item_1,data);
       ListView listView = (ListView) findViewById(R.id.list_students);
        listView.setAdapter(adapter);
         listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                 Student student = studentList.get(i);
                 Toast.makeText(TeacherActivity.this,student.getName()+"  ID:"+student.getId(),Toast.LENGTH_LONG).show();
                 Intent intent = new Intent(TeacherActivity.this,StudentOfTeacherActivity.class);
                 startActivity(intent);
             }
         });

    }
    private  void initStudents()
    {
        Student Ellen = new Student("Ellen",R.drawable.ellen,1);
        studentList.add(Ellen);
        Student Sophia = new Student("Sophia",R.drawable.sophia,2);
        studentList.add(Sophia);
        Student Steve = new Student("Steve",R.drawable.steve,3);
        studentList.add(Steve);
        Student Tom = new Student("Tom",R.drawable.tom,4);
        studentList.add(Tom);
       Student Charile = new Student("Charile",R.drawable.charile,5);
       studentList.add(Charile);
        Student Tommy = new Student("Tommy",R.drawable.tommy,6);
        studentList.add(Tommy);
    }
}
