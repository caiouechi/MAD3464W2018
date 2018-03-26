/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author macstudent
 */
public class MyText implements Runnable {

    public MyText() {
    }

    @Override
    public void run() {
        System.out.println("Texting...");
    }
    
}
