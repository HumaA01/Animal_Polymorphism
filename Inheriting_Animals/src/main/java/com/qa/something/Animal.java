package com.qa.something;

public abstract class Animal {

    private String colour;
    private Gender gender;
    private int noOfLegs;
    private int Age;

    public Animal()
    {
        this("Unkown", Gender.Female, 0, 0);

    }
    public Animal(String colour, Gender gender, int legs, int age)
    {
        this.colour = colour;
        this.gender = gender;
        this.noOfLegs = legs;
        this.Age = age;
    }

    @Override
    public String toString() {
        //return super.toString();
        String output = String.format("This animal's colour is %s. They are %s. Their age is %d and they have %d legs.",
                getColour(), getGender(), getAge(), getNoOfLegs() );
        return output;
    }

    public abstract String animalNoise();

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }



}
