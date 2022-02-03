package com.company;

import java.util.Scanner;

public class Parrot {
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

    public void infoOfParrot() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter parrots name: ");
        String inputFedyaName = input.nextLine();
        setName(inputFedyaName);

        System.out.print("Enter parrots age: ");
        int inputFedyaAge = input.nextInt();
        setAge(inputFedyaAge);

        System.out.print("Enter parrots weight: ");
        int inputFedyaWeight = input.nextInt();
        setWeight(inputFedyaWeight);

        System.out.println();

        System.out.println("The parrots name is: "+getName()+
                "\nThe parrots age is: "+getAge()+
                "\nThe parrots weight is: "+getWeight());
    }

}
