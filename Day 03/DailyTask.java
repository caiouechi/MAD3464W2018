/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

import java.util.Scanner;

/**
 *
 * @author macstudent
 */
public class DailyTask {
    public static void main(String[] args){
        Faculty obj = new Faculty();
       
        obj.readData();
        obj.displayData();
//        obj.displayValues();
        obj.setData();
        obj.getData();
        
    }
    
}

interface P{

    void readData();
    void displayData();
}

class Person implements P{
    String name ;
    int age ;
    @Override
    public void readData(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Name : ");
        name = input.nextLine();
        
        System.out.println("Enter age : ");
        age = input.nextInt();
        
    }
    @Override
    public void displayData() {
        System.out.println("LastName : " + name);
        System.out.println("Age : " + age);
    }
}

interface E{
    String type = "PT" ;
    double salary = 2364;
   
//    void readValues();
//    void displayValues();
    void readData();
    void displayData();
}


class Faculty extends Person implements E{

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
