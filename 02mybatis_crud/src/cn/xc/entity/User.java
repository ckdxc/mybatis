package cn.xc.entity;

import java.math.BigInteger;

public class User {
    private int id;
    private String name;
    private String pwd;

    public User() { }

    public User(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "id:"+this.id+" name:"+this.name+" pwd:"+this.pwd;
    }
}
