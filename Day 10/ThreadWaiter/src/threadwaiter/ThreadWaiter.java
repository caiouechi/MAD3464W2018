/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadwaiter;

/**
 *
 * @author macstudent
 */
public class ThreadWaiter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Message msg = new Message("process it");
        Waiter waiter = new Waiter(msg);
        new Thread(waiter,"WAITER00").start();
        
        Waiter waiter1 = new Waiter(msg);
        new Thread(waiter1, "WAITER01").start();
        
        Notifier notifier = new Notifier(msg);
        new Thread(notifier, "NOTIFIER").start();
        
        System.out.println("All the threads are started");
    }
    
}
