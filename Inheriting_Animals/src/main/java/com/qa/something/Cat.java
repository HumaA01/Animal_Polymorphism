package com.qa.something;

import com.qa.exceptions.InvalidActionException;

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

    private boolean hadTreat = false;

    public boolean isHadTreat() {
        return hadTreat;
    }

    public void setHadTreat(boolean hadTreat) {
        this.hadTreat = hadTreat;
    }

    public String giveTreat() throws InvalidActionException
    {
        if(isHadTreat())
        {
            throw new InvalidActionException();
        }
        else {
            this.setHadTreat(true);
            return "Animal has been given a treat";
        }
    }


    public String giveTreat(String treat) throws InvalidActionException
    {
        if(isHadTreat())
        {
            throw new InvalidActionException("DONT GIVE ANOTHER TREAT");
        }
        else {
            this.setHadTreat(true);
            return "Animal has been given " + treat;
        }
    }


    @Override
    public String animalNoise() {
//      //return super.animalNoise();
        return "No specific sound";
    }
}
