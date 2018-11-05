package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] names = new String[10];
        int[] ages = new int[10];

        int maxLength = 0;
        int youngestAge;
        int oldestAge;
        String youngestName;
        String oldestName;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a name:");
            String name = in.nextLine();
            if ("done".equals(name.toLowerCase())){
                break;
            }
            System.out.println("Enter the age:");
            int age = in.nextInt();
            in.nextLine();
            names[i] = name;
            ages[i] = age;
            maxLength++;
        }
        youngestName = names[0];
        youngestAge = ages[0];
        oldestName = names[0];
        oldestAge = ages[0];
        for (int i = 0; i < maxLength; i++) {
            System.out.println(names[i] + ": " + ages[i]);
            if (ages[i] < youngestAge){
                youngestAge = ages[i];
                youngestName = names[i];
            } else if (ages[i] > oldestAge) {
                oldestAge = ages[i];
                oldestName = names[i];
            }
        }
        System.out.println("Youngest: " + youngestName + ", " + youngestAge);
        System.out.println("Oldest: " + oldestName + ", " + oldestAge);
    }
}
