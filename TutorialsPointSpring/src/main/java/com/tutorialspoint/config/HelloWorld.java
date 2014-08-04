package com.tutorialspoint.config;

public class HelloWorld {
    private String message = "some default message";

    public void setMessage(String message){
        this.message  = message;
    }

    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
}