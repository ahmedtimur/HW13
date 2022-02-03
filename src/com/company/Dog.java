package com.company;

import java.util.Scanner;

public class Dog {
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

    public void infoOfDog() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter dogs name: ");
        String inputSharikName = input.nextLine();
        setName(inputSharikName);

        System.out.print("Enter dogs age: ");
        int inputSharikAge = input.nextInt();
        setAge(inputSharikAge);

        System.out.print("Enter dogs weight: ");
        int inputSharikWeight = input.nextInt();
        setWeight(inputSharikWeight);

        System.out.println();

        System.out.println("The dogs name is: "+getName()+
                "\nThe dogs age is: "+getAge()+
                "\nThe dogs weight is: "+getWeight());
    }

}
