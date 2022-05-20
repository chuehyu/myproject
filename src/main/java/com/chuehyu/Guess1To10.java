package com.chuehyu;

import java.util.Random;
import java.util.Scanner;

public class Guess1To10 {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(10)+1;
        System.out.println(secret);
        System.out.println("Please enter a number(1-10);");
        Scanner scanner = new Scanner(System.in);
        String s  = scanner.next();
    int num =Integer.parseInt(s);
    if (num > secret) {
        System.out.println("Smaller");
    }
    if (num < secret) {
        System.out.println("Bigger");
    }
    if (num == secret) {
        System.out.println("Bingo");
    }
    }
}
