/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

import java.util.Scanner;

/**
 *
 * @author droidpulkit
 */
public class AirlineReservation {

    boolean[] nonsmokingClass = new boolean[5];
    boolean[] smokingClass = new boolean[5];
    int numnonSmokingClass = 0;
    int numSmokingClass = 0;
    Scanner scan = new Scanner(System.in);

    public void book() {
        System.out.println("Press 1 for Smoking and 2 for Non-Smoking class.");
        int choice = scan.nextInt();
        if (choice == 1) {
            smokingClass();
        } else if (choice == 2) {
            nonsmokingClass();
        } else {
            System.out.println("Invalid selection");
        }
    }

    private void nonsmokingClass() {
        if (numnonSmokingClass < 5) {
            for (int i = 0; i < nonsmokingClass.length; i++) {
                if (!nonsmokingClass[i]) {
                    nonsmokingClass[i] = true;
                    System.out.println("NonSmoking Class. Seat number: " + (i + 1));
                    numnonSmokingClass++;
                    break;
                }
            }
        } else if (numSmokingClass < 5) {
            System.out.println("No more non-smoking class. Press 1 if you would like to book an smoking class ticket.");
            int choice = scan.nextInt();
            if (choice == 1) {
                smokingClass();
            } else {
                System.out.println("The next flight leaves in 3 hours.");
            }
        } else {
            System.out.println("All booked, the next flight leaves in 3 hours.");
        }
    }

    private void smokingClass() {
        if (numSmokingClass < 5) {
            for (int i = 0; i < smokingClass.length; i++) {
                if (!smokingClass[i]) {
                    smokingClass[i] = true;
                    System.out.println("Smoking Class. Seat number: " + (i + 6));
                    numSmokingClass++;
                    break;
                }
            }
        } else if (numnonSmokingClass < 5) {
            System.out.println("No more Smoking. Press 1 if you would like to book a non smoking class ticket.");
            int choice = scan.nextInt();
            if (choice == 1) {
                nonsmokingClass();
            } else {
                System.out.println("The next flight leaves in 3 hours.");
            }
        } else {
            System.out.println("All booked, the next flight leaves in 3 hours.");
        }
    }

}
