/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

/**
 *
 * @author macstudent
 */
public class ShapeNew {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        MyShape obj1 = MyShape();
           MyCircle obj = new MyCircle();
           obj.draw();
           obj.display("I am a Circle");
        
    }
    
}

//any class defined as abstract cannot be instantiated (object cannot be created)
abstract class MyShapeNew{
    int x;
    int y;
    
    abstract void draw();
    
    void display(String msg){
        System.out.println(msg);
    }
    
}

class MyCircle extends MyShapeNew{

    @Override
    void draw() {
       System.out.println("Drawing Circle");
       super.x = 20;
       super.y = 30;
       System.out.println("x = " + super.x + " y = " + super.y);
       
    }
}

abstract class Rectangle extends MyShapeNew{
    int h;
    abstract void draw();
}
