package com.company;

public class Main {

    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.setBreed("Dolphin");
        fish.setGender("Female");
        fish.setAge(5);
        fish.setWeight(50);

        System.out.println(fish.getBreed() + " "
                + fish.getGender() + " "
                + fish.getAge()+ " "
                + fish.getWeight());

        Parrot parrot = new Parrot();
        parrot.setBreed("Pionus");
        parrot.setGender("Male");
        parrot.setAge(3);
        parrot.setWeight(2);

        System.out.println(parrot.getBreed() + " "
                + parrot.getGender() + " "
                + parrot.getAge()+ " "
                + parrot.getWeight());

        Cat cat  = new Cat();
        cat.setName("Tom");
        cat.setBreed("Scottish Fold");
        cat.setColor("Grey");
        cat.setGender("Male");
        cat.setAge(4);
        cat.setWeight(6);

        System.out.println(cat.getName() + " "
                + cat.getBreed() + " "
                + cat.getColor() + " "
                + cat.getGender() + " "
                + cat.getAge() + " "
                + cat.getWeight());

        Dog dog = new Dog();
        dog.setName("Hachiko");
        dog.setBreed("Akita Inu");
        dog.setColor("White");
        dog.setGender("Male");
        dog.setAge(11);
        dog.setWeight(12);

        System.out.println(dog.getName() + " "
                + dog.getBreed() + " "
                + dog.getColor() + " "
                + dog.getGender() + " "
                + dog.getAge() + " "
                + dog.getWeight());
    }
}
