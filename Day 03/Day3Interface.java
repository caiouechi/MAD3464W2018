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
public class Day3Interface {
    
    
    public static void main (String[] args){
        Addition obj1 = new Addition();
        obj1.display();
        
        Counting cn1 = new Counting();
        cn1.display();
        
        A a1 = new A();
        a1.display();
        a1.calcMultiplication();
        
        B b1 = new B();
        b1.display();
        b1.calcMultiplication();
        b1.calcDivision();
        
        C c1 = new C();
        c1.display();
        c1.calcMultiplication();
        c1.calcDivision();
        
    }
    
}

interface Arithmetic{
    int n1 = 10;
    int n2 = 10;
    void display();
}

class Addition implements Arithmetic{
//    int n1 = 20;
//    int n2 = 20;
    @Override
    public void display() {
       System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
       System.out.println("Inside Additon Class");
    }
    
}

class Counting extends Addition{
    
}

interface multiplication extends Arithmetic{
    void calcMultiplication();
}

class A implements multiplication{
    @Override
    public void display(){
        System.out.println("n1 = " + n1 + " n2  = " + n2);
    }
    
    @Override
    public void calcMultiplication(){
        System.out.println("multiplication : " + (n1*n2));
    }
}

interface division extends Arithmetic{
    void calcDivision();
}

class B extends Addition implements division, multiplication{
    @Override
    public void calcDivision(){
        System.out.println("Division : " + (n1/n2));
    }
    
    @Override
    public void display(){
        System.out.println("Inside Class B");
        System.out.println("n1 = " + n1 + " n2  = " + n2);
    }
    
    @Override
    public void calcMultiplication(){
        System.out.println("multiplication : " + (n1*n2));
    }
}

class C extends B{
    int c1 = 20;
}