/*
 * Author: Jigisha Patel
 * Purpose: Academic
 * 
 */
package multithreading;

import java.util.Random;

/**
 *
 * @author jkp
 */
public class Receiver implements Runnable{
    private Carrier carrier;
    
    Receiver(Carrier carrier){
        this.carrier = carrier;
    }

    @Override
    public void run() {
        Random random = new Random();
        String message = carrier.receiveMessage();
        
        while(!message.equals("Over n Out")){
            message = carrier.receiveMessage();
            System.out.println("Receing the message");
            
            System.out.format("MESSAGE RECEIVED: %s%n", message);
            
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    
}
