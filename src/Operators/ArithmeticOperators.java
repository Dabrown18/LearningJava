package Operators;

public class ArithmeticOperators {
	public static void main(String[] args) {
		/*
         * OPERATOR - characters used to operate on variables
         * 
         *  ARITHMETIC operators
         *      +   adding numbers and merging strings (
         *      -   subtraction
         *      *   multiplying
         *      /   dividing
         *      
         *      %  the remainder of the division (mod operator) % 5
         *      
         *      =   assigning value
         *      +=  
         *      -=
         *      /=
         *      *=
         *      %=
         *      
         *      
         *      ++   incrementation - increase the value by 1
         *      --   decrementation - decrease the value by 1
         *      
         *      x++ POST incrementation
         *      x-- POST DECREMENTATION
         *      
         *      ++x PRE INCREMENTATION
         *      --x PRE DECREMENTATION
         */     
        
        
        int a = 5;
        

        //a += 3; // a = a + 3;
        
        //a--; //a += 1;
        
        
        int i = 0;
        System.out.println(i % 3); // 0/3 = 0
        i++;
        System.out.println(i % 3); // 1/3 = 1
        i++;
        System.out.println(i % 3); // 2/3 = 2
        i++;
        System.out.println(i % 3); // 3/3 = 0
        i++;
        System.out.println(i % 3); // 4/3 = 1
	}
}