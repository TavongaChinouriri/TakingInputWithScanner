package com.company;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking the user's input.");
        Scanner input = new Scanner(System.in);
        System.out.println("Student Name ");
        String name = input.next();
        System.out.println("Student Reg Number ");
        String reg_no = input.next();
        System.out.println("Student Age ");
        String age = input.next();
        System.out.println("Student Program Code ");
        String program = input.next();
        System.out.println("THIS IS HOW YOU USE THE SCANNER CLASS");
    }
}
