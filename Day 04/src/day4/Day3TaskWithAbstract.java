/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

import java.util.Scanner;

/**
 *
 * @author macstudent
 */
public class Day3TaskWithAbstract {
     public static void main(String[] args){
        Faculty obj = new Faculty() {};
       
        obj.readData();
        obj.displayData();
//        obj.displayValues();
        obj.setData();
        obj.getData();
        
    }
    
    
}

abstract class P{
    
    String name ;
    int age ;

    void readData(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Name : ");
        name = input.nextLine();
        
        System.out.println("Enter age : ");
        age = input.nextInt();
        
    }
   abstract void displayData();
}

class Person extends P{
    
    @Override
    public void displayData() {
        System.out.println("LastName : " + name);
        System.out.println("Age : " + age);
    }
}

interface E{
    String type = "PF";
    double salary = 7525656;
   
    void readData();
    void displayData();
}



abstract class Faculty extends P implements E{

   String course;

    void setData(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter course : ");
        course = input.nextLine();
        
    }
    
    void getData(){
        System.out.println("Course : " + this.course);
    }
    
    
//   @Override
//   public void displayValues(){
//       System.out.println("Type : " + type);
//       System.out.println("Salary : " + salary);
//   }
//    @Override
//   public void readValues(){
//       System.out.println("Read Values");
//   }
   
   @Override
     public void displayData(){
       System.out.println("Employee E");
       
   }
    @Override
   public void readData(){
       System.out.println("Employee Read Values");
   }
   
}
