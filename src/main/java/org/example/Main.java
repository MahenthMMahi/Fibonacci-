package org.example;

import java.util.Scanner;
import java.util.logging.SocketHandler;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        while (true){
            // This is the program to find the n th number of the fibnoacci series
            Scanner scanner = new Scanner(System.in);
            System.out.println("Which term of fibnoacci number do you what to see?");
            int number = scanner.nextInt();

            int first = 0;
            int second = 1;

            // handle the case of negative and zero first
            if (number < 0) {
                System.out.println("Can not applicable the number!");
            } else {
                if (number == 1)
                    // if the user input is either 1
                    System.out.println("The fibnoacci number of " + number + "is " + first);
                else if (number == 2)
                    // if the user input is either 1 or 2
                    System.out.println("The fibnoacci number of " + number + "is " + second);
                else {
                    int current = 0;

                    for (int i = 3; i <= number; i++) {
                        current = first + second;
                        first = second;
                        second = current;

                    }
                    System.out.println("The fibnoacci number of " + number + "is " + current);
                }
            }
        }
    }
}