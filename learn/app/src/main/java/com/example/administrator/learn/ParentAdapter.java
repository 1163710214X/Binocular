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

import java.util.List;


/**
 * Created by Administrator on 2018/7/13.
 */

public class ParentAdapter extends ArrayAdapter<Parent> {
    private  int resourceId;
    public ParentAdapter(Context context , int textViewResourceId, List<Parent> objects)
    {
        super(context,textViewResourceId,objects);
        resourceId = textViewResourceId;
    }


    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Parent parent1 = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        //ImageView studentImage = (ImageView) view.findViewById(R.id.student_image);
        TextView studentName = (TextView) view.findViewById(R.id.student_name);

        studentName.setText(parent1.getName()+"   LicenseNum:"+parent1.getLicenseNum());
        return view;
    }
}
