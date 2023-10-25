package com.qa.Interface;

public interface Petable {

     public String callPet();
     public String giveTreat();
     default String admirePet()
    {
        return "you're a cool pet!";
    }

}
