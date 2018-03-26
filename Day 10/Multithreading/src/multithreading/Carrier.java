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
public class Carrier {
    private String Message;
    private boolean HaveMessage = true;

    
    
    
    public synchronized String ReceiveMessage(){
       
        while(HaveMessage){
             try{
            wait();
        }catch(InterruptedException e){
            e.printStackTrace();
        } 
        }
      
        
        this.HaveMessage = true;
        notifyAll();
        
        return this.Message;
    }
    
    public synchronized void SendMessage(String message){
       while(!HaveMessage){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Sending the message");
        HaveMessage = false;
        this.Message = message;
        notifyAll();
   
    }
            
    
}
