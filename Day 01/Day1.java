/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;

/**
 *
 * @author droidpulkit
 */
public class Day1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // to print Square pattern
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == 5) {
                    System.out.print("* ");
                } else if (j == 1 || j == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        //to print the second pattern
        int k = 9;
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= k; j++) {
                if (i == 9 || i == 1) {
                    System.out.print("* ");
                } else if (j == 1 || j == 9) {
                    System.out.print("* ");
                } else if (i == 2 && ((j == 2) || (j == 3) || (j == 4) || (j == 6) || (j == 7) || (j == 8))) {
                    System.out.print("* ");
                } else if (i == 3 && ((j == 2) || (j == 3) || (j == 7) || (j == 8))) {
                    System.out.print("* ");
                } else if (i == 4 && ((j == 2) || (j == 8))) {
                    System.out.print("* ");
                } else if (i == 6 && ((j == 2) || (j == 8))) {
                    System.out.print("* ");
                } else if (i == 7 && ((j == 2) || (j == 3) || (j == 7) || (j == 8))) {
                    System.out.print("* ");
                } else if (i == 8 && ((j == 2) || (j == 3) || (j == 4) || (j == 6) || (j == 7) || (j == 8))) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
