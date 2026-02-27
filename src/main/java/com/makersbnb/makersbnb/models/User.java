package com.makersbnb.makersbnb.models;

public class User {

    private Integer id;
    private String name;
    private String email;
    private String password;

    public  User(Integer id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password=password;
    }

    public Integer getId() {return id;}
    public String getName(){return name;}
    public String getEmail(){return email;}
    public String getPassword(){return password;}

    public void setId(Integer newId){this.id=newId;};
    public void setName(String newName){this.name=newName;};
    public void setEmail(String newEmail){this.email=newEmail;};
    public void setPassword(String newPassword){this.password=newPassword;};

}
