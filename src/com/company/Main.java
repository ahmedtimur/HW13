package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /**
         * Балык, Попугай, мышык жана ит деген класс тузунуз
         * Алардын свойстваларын ойлоп табыныз
         * Бир канча объектилерин тузуп жана аларга маанилерин бериниз
         * Аларды консольго чыгарыныз
         * Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек
         * */

        Parrot fedya = new Parrot();
        fedya.infoOfParrot();
        System.out.println();

        Fish bulka = new Fish();
        bulka.infoOfFish();
        System.out.println();

        Cat masha = new Cat();
        masha.infoOfCat();
        System.out.println();

        Dog sharik = new Dog();
        sharik.infoOfDog();
        System.out.println();


    }
}

