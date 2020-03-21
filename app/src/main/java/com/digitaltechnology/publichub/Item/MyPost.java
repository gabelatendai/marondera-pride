package com.digitaltechnology.publichub.Item;

public class MyPost {
private int id;
private String name;
private String email;
private String subject;
private String phone;

private String message;
public MyPost(int id,String name,String email, String subject,String message,String phone){
    this.id= id;
    this.name= name;
    this.phone= phone;
    this.email=email;
    this.subject=subject;
    this.message= message;
}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }
}
