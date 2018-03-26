/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author DarronBrown
 */
public class ObjectOrientedProgramming {
    public static void main(String[] args) {
        /*
            Objects - containers that stores variables and functions thematically 
                      connected to each other for easier future usage
            Classes - blueprint for creating instances (copies) of objects      
            
            Properties - features (part of something)
            Methods - functions 
        */
        
        Monitor monitor1 = new Monitor();
        
        monitor1.width = 1000;
        
        monitor1.getWidth();
        
        Point p = new Point();
        
    }
}

class Monitor {
    // Properties
    int width;
    int height;
    int brightness;
    
    // Methods
    void changeBrightness() {
        /*
            THIS IS PLACE FOR INSTRUCTION TO BE DONE
        */
    }
    
    void getWidth() {
        System.out.println(width);
    }
}

class Point {
    Point() {
        System.out.println("This the default constructor.");
    }
    
    int x;
    int y;
}
