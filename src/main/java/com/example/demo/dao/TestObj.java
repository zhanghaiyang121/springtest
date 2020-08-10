package com.example.demo.dao;

import com.example.demo.bean.UserBean;

import java.util.List;

public class TestObj {
    private int a;
    private String b;
    private List<UserBean> data;
    public TestObj(int a, String b, List<UserBean> data){
        this.a=a;
        this.b=b;
        this.data=  data;
    }

    public int getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public List<UserBean> getData() {
        return data;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(String b) {
        this.b = b;
    }

    public void setData(List<UserBean> data) {
        this.data = data;
    }
}
