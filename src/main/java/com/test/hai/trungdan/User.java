package com.test.hai.trungdan;
 
/**
 * Entity to represent a Country object
 *
 * @author wwww.codejava.net
 */
public class User {
 
    private String name;
    private String avatar;
 
    public User(){}
    public User(String name, String avatar) {
        this.name = name;
        this.avatar = avatar;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getAvatar() {
        return avatar;
    }
 
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
} 