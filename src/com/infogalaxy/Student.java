package com.infogalaxy;

import java.util.Scanner;

public class Student {
    int id;
    String name;
    Scanner sc = new Scanner(System.in);
    void setStudent(){
        System.out.println("Enter The ID : ");
        id = sc.nextInt();
        System.out.println("Enter The Name : ");
        name = sc.next();
    }
}
