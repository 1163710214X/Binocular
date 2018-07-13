package com.example.administrator.learn;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.learn.R;
import com.example.administrator.learn.Student;

import java.util.List;

/**
 * Created by Administrator on 2018/7/12.
 */

public class StudentAdapter extends ArrayAdapter<Student> {
    private  int resourceId;
    public StudentAdapter(Context context , int textViewResourceId, List<Student> objects)
    {
        super(context,textViewResourceId,objects);
        resourceId = textViewResourceId;
    }


    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Student student = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        ImageView studentImage = (ImageView) view.findViewById(R.id.student_image);
        TextView studentName = (TextView) view.findViewById(R.id.student_name);
        studentImage.setImageResource(student.getImageId());
        studentName.setText(student.getName()+"   ID:"+student.getId());
        return view;
    }
}
