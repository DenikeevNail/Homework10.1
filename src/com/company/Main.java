
package com.company;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog();

        Dog dog2 = new Dog("Барсик", "Азиат", Color.WHITE,
                new Shelter("Gvozdichka", "Abdrahmanova"));

        Dog dog3 = new Dog("Мухтар", "Бульдог", Color.BLACK,
                new Shelter("Gvozdichka", "Abdrahmanova"), "Сидеть");


        System.out.println(dog2.getInfo());
        System.out.println(dog3.getInfo());
        dog1.makeVoice();
        dog2.makeVoice(3);
        dog3.makeVoice("Gav");
    }
}