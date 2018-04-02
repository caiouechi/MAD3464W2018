/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

/**
 *
 * @author macstudent
 */
public class Day3Exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 10, n2 = 2;
        int ar1[] = {10, 20, 30};
        
        //cant perform n/0 so keep it in try block
        //to explicitly generate the error use throw keyword
        try{
            if (n2 == 0){
                throw new ArithmeticException();
            }else{
                n1 = n1 / n2;
            }
            
            n2 = ar1[4];
            System.out.println("Value of n2 : " + n2);
        }
        
        catch(ArithmeticException e){
            System.out.println("Unable to divide by zero.");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Arary element Unavailable.");
        }
        //Super class for all excepption
        catch(Exception e){
            System.out.println("Somethinfg wrong......");
        }
        finally{
           System.out.println("Value of n1 : " + n1); 
        }  
        
    }
    
}
