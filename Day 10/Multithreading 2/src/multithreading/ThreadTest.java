/*
 * Author: Jigisha Patel
 * Purpose: Academic
 * 
 */
package multithreading;

/**
 *
 * @author jkp
 */
public class ThreadTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException{
        // TODO code application logic here
        
        System.out.println(Thread.currentThread().getName());
        
        for (int i= 1;i <=5;i++){
          //  MyMessage m1 = new MyMessage();
           // m1.start();
           // m1.sleep(2000);

            Thread t1 = new Thread( new MyText());
            t1.start();
        }
    }
    
}


