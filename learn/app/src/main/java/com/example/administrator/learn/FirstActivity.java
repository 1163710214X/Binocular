package com.example.administrator.learn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

import static android.widget.Toast.LENGTH_SHORT;

public class FirstActivity extends AppCompatActivity   {
     private  EditText account;
     private  EditText password;
    private Button button1;
    private  int chooseNum = 1; //1 for parent ;2 for teacher
    private Map<String,String> map = new HashMap<>();
    private  void generateMap()
    {
        // 从数据库中读取数据来注册登录信息
        map.put("Tom","123456");
        map.put("Anderson","123456");
        map.put("Trump","123456");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        account = (EditText) findViewById(R.id.edit_account);
        password = (EditText) findViewById(R.id.edit_password);
        generateMap();
       // System.out.println("");
       //System.out.println(account.getText().toString()+"就是这里");
       // System.out.println(password.getText().toString()+"这里是密码");
       // Log.v(account.getText().toString(), "This is Verbose.");


         button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v)
            {
                 if(map.containsKey(account.getText().toString())&&map.get(account.getText().toString()).equals(password.getText().toString()))
                  //if(account.getText().toString().equals("Tom")&&password.getText().toString().equals("1"))
                  {
                      switch (v.getId())
                      {
                          case R.id.button_1:
                              // Toast.makeText(this,account.getText().toString(), LENGTH_SHORT).show();
                              if(chooseNum == 1){
                                  Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                                  startActivity(intent);
                              }
                              else
                              {
                                  Intent intent = new Intent(FirstActivity.this,TeacherActivity.class);
                                  startActivity(intent);
                              }

                              break;
                          default:
                              break;
                      }
                  }

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this,"Hello Parent!", LENGTH_SHORT).show();
                chooseNum =1;
                break;
            case R.id.remove_item:
                Toast.makeText(this, "Hello Teacher", LENGTH_SHORT).show();
                chooseNum = 2;
                break;
            default:

        }
        return true;
    }
}
