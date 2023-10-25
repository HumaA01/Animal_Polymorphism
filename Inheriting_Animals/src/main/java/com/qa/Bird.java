package com.qa;

public class Bird extends Animal {


    public String getBeakColour() {
        return beakColour;
    }

    public void setBeakColour(String beakColour) {
        this.beakColour = beakColour;
    }

    private String beakColour;
    public Bird()
    {
        super();
        this.beakColour = "Yellow";
    }

    public Bird(String colour, Gender gender, int legs, int age, String beakColour)
    {
        super(colour, gender, legs, age);
        this.beakColour = beakColour;
    }

    @Override
    public String animalNoise() {
       return "Squawk";
    }

    @Override
    public String toString() {
        String output = String.format("I am a %s %s Bird. I have %d legs and am %d years old. My beak colour is %s!"
                ,this.getColour(), this.getGender(), this.getNoOfLegs(), this.getAge(), this.getBeakColour());
        return output;
    }
}
