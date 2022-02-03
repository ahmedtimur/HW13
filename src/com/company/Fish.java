package com.company;

import java.util.Scanner;

public class Fish {
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

public void infoOfFish() {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter fish name: ");
    String inputBulkaName = input.nextLine();
    setName(inputBulkaName);

    System.out.print("Enter fish age: ");
    int inputBulkaAge = input.nextInt();
    setAge(inputBulkaAge);

    System.out.print("Enter fish weight: ");
    int inputBulkaWeight = input.nextInt();
    setWeight(inputBulkaWeight);

    System.out.println();

    System.out.println("The fish name is: "+getName()+
            "\nThe fish age is: "+getAge()+
            "\nThe fish weight is: "+getWeight());

}

}
