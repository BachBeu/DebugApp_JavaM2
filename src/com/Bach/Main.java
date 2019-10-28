package com.Bach;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0' , please enter constant: ");

        Scanner scan = new Scanner(System.in);

        System.out.println("a: ");
        double a = scan.nextDouble();

        System.out.println("b: ");
        double b = scan.nextDouble();

        if(a != 0){
            double solution = -b/a;
            System.out.printf("The solution is: %f!", solution);
        }else{
            if(b == 0){
                System.out.println("The solution is all x!");
            }else{
                System.out.println("no solution!");
            }
        }
    }
}
