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
public class Methods {
    public static void main(String[] args) {
        /*
            Objects - containers that stores variables and functions thematically 
                      connected to each other for easier future usage
            Classes - blueprint for creating instances (copies) of objects      
            
            Properties - features (part of something)
            Methods - functions 
        */
        System.out.println("");
        
        Test test1 = new Test();
        
        test1.printSomething("Darron", "Brown");
        
        int result = test1.add(4, 5);
        System.out.println(result);
    }
}

class Test {
    
    void printSomething( String firstname, String lastname ) {
        System.out.println(firstname + " " + lastname + " is the greatest!");
    }
    
    int add (int a, int b) {
        return a + b;
    }
    
}