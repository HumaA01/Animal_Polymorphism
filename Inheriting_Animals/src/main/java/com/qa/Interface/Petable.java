package com.qa.Interface;

public interface Petable {

     public String callPet();

     default String admirePet()
    {
        return "you're a cool pet!";
    }

}
