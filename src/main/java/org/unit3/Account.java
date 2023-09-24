package org.unit3;

public class Account {
    // Instance variable
    private String name;


    // Constructor
    public Account(String name){
        this.name = name;
    }

    // Getter and Setter
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
