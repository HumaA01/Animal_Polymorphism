package com.qa.something;


import com.qa.Interface.Petable;

import java.util.ArrayList;

public class App
{
    public static void main( String[] args )
    {
        Cat cat1 = new Cat();
        cat1.setGender(Gender.Female);
        cat1.setAge(2);
        cat1.setColour("Grey");
        cat1.setNoOfLegs(4);

        System.out.println(cat1.toString());

        System.out.println(cat1.animalNoise());

        Cat cat2 = new Cat("Beige", Gender.Male, 4, 3, "Wild");
        Cat cat3 = new Cat("Beige", Gender.Male, 4, 3, "Domestic" );
        Bird bird1 = new Bird("Blue", Gender.Female, 2, 1, "Yellow");
        bird1.setBeakColour("Brown");
        System.out.println(bird1.toString());
        System.out.println(bird1.animalNoise());


        DomesticCat catDom = new DomesticCat("Orange", Gender.Female, 4, 5, "Persian", "Ana");
        SmallBird smallBird = new SmallBird("Brown", Gender.Female, 2, 21, "Red", true, "Huma");
        SmallBird smallBird2 = new SmallBird("Blue", Gender.Male, 2, 2, "Yellow", false, "Rio");


        System.out.println(catDom.admirePet());
        System.out.println(smallBird.callPet());

        ArrayList<Animal> Zoo = new ArrayList<>();
        Zoo.add(cat1); Zoo.add(cat2); Zoo.add(bird1); Zoo.add(smallBird);

        for (Animal a: Zoo) {
            System.out.println(a.animalNoise());

        }

        ArrayList<Petable> pets = new ArrayList<>();
        pets.add(catDom); pets.add(smallBird); pets.add(smallBird2);

        for(Petable p: pets)
        {
            System.out.println(p.admirePet());
            System.out.println(p.callPet());
            System.out.println(p.giveTreat());
        }





    }
}
