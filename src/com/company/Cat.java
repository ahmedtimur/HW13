package com.company;

import java.util.Scanner;

public class Cat {
    private String name;
    int age, weight;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public int getWeight() {

        return weight;
    }

    public void setWeight(int weight) {

        this.weight = weight;
    }

public void infoOfCat() {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter cats name: ");
    String inputMashaName = input.nextLine();
    setName(inputMashaName);

    System.out.print("Enter cats age: ");
    int inputMashaAge = input.nextInt();
    setAge(inputMashaAge);

    System.out.print("Enter cats weight: ");
    int inputMashaWeight = input.nextInt();
    setWeight(inputMashaWeight);

    System.out.println();

    System.out.println("The cats name is: "+getName()+
            "\nThe cats age is: "+getAge()+
            "\nThe cats weight is: "+getWeight());

}

}
