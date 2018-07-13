package com.example.administrator.learn;

import java.util.List;

/**
 * Created by Administrator on 2018/7/12.
 */

public class Parent {
    private  String name;
    private String licenseNum;
    private List<Student> child;
    public Parent(String name,String licenseNum)
    {
        this.name = name;
        this.licenseNum = licenseNum;

    }
    public String getName()
    {
        return this.name;
    }
    public String getLicenseNum()
    {
        return this.licenseNum;
    }
    public List<Student> getChild()
    {
        return this.child;
    }
    public void setChild(List<Student> child)
    {
        this.child =child;
    }
}
