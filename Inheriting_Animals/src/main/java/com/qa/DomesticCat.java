package com.qa;

import org.w3c.dom.ls.LSOutput;

public class DomesticCat extends Cat implements Petable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DomesticCat()
    {
        super();
        this.name = "Anonymous";
    }
    public DomesticCat(String colour, Gender gender, int legs, int age, String family, String name)
    {
        super(colour, gender, legs, age, family);
        this.name = name;
    }

    @Override
    public String animalNoise() {
        return "MEOW!";
    }


    @Override
    public String callPet() {
        return this.getName() + " come here!";
    }

    @Override
    public String giveTreat() {
        return this.getName() + " here's a treat!";
    }

    @Override
    public String admirePet() {
        return Petable.super.admirePet();
    }
}
