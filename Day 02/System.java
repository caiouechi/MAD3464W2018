/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

/**
 *
 * @author droidpulkit
 */
public class System {
    int capacity = 10;
    String seats;
    int i;
    
    int seatChart[] = new int[10];
    
    System(int capacity, String seats){
        this.capacity = capacity;
        this.seats = seats;
    }
    
    void assignCapacity(){
        
        
    }
    
    void assignSeat(){
        for(i=0;i<seatChart.length;i++)
        seatChart[i] = 0;
        if (seatChart[i] == 0){
            seatChart[i] = 1;
            java.lang.System.out.println("Seat allocated is : " + seatChart[i]);
        }
        else{
            java.lang.System.out.println("Seat is already allocated");
        }
        
    }
}
