package com.example.administrator.learn;

/**
 * Created by Administrator on 2018/7/12.
 */

public class Student {
    private String name;
    private int id;
    private  int imageId;
    public Student(String name,int imageId,int id)
    {
        this.imageId = imageId;
        this.name = name;
        this.id = id;
    }
    public  String getName()
    {
        return  this.name;
    }
    public int getId()
    {
        return this.id;
    }
    public  int getImageId()
    {
        return  imageId;
    }
}
