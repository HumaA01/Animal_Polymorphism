package com.qa.something;

import com.qa.Interface.Petable;

public class SmallBird extends Bird implements Petable
{
    private boolean canTalk;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCanTalk() {
        return canTalk;
    }

    public void setCanTalk(boolean canTalk) {
        this.canTalk = canTalk;
    }

    public SmallBird()
    {
        super();
        this.canTalk = false;
        this.name = "Anonymous";
    }

    public SmallBird(String colour, Gender gender, int legs, int age, String beakCOl, boolean canTalk, String name)
    {
        super(colour, gender, legs, age, beakCOl);
        this.canTalk = canTalk;
        this.name = name;
    }

    @Override
    public String animalNoise() {
        if(this.isCanTalk())
        {
            return "Hello I can talk";
        }
        else
        {
            return "Squeak";
        }
    }

    @Override
    public String callPet() {
        return this.getName() + "fly here!";
    }

    @Override
    public String giveTreat() {
        return this.getName() + "here is your treat!";
    }

    @Override
    public String admirePet() {
        return Petable.super.admirePet();
    }
}
