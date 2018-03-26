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
public class multi {
    
//    public static void main(String[] args) throws InterruptedException{
//        System.out.println(Thread.currentThread().getName());
//        
//        for(int i = 1; i<=5; i++){
//            MyMessage m1 = new MyMessage();
//            m1.start();
//            m1.sleep(2000);
//            
//            Thread t1 = new Thread( new MyText());
//            t1.start();
//            
//        }
//    }
        public static void main(String[] args) throws InterruptedException{
    
            System.out.println("oi");
            Carrier carrier = new Carrier();
        (new Thread(new Sender(carrier))).start();
        (new Thread(new Receiver(carrier))).start();
        
        }
    
}
