package com.qa.something;

public class Cat extends Animal {

    private String family;

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
    public Cat()
    {
        super();
        this.family = "Unknown Fam";
    }
    public Cat(String colour, Gender gender, int legs, int age, String family) {
        super(colour, gender, legs, age);
        this.family = family;
    }

    @Override
    public String animalNoise() {
//      //return super.animalNoise();
        return "No specific sound";
    }
}
