package com.crisanaya;

public class Main {
    //Adds numbers a + b
    public static int add(int a, int b){
        return a + b ;
    }
        
    //Subtract numbers a - b
    public static int subtract(int a, int b){
        return a - b;
    }
       
    //Multiply numbers a * b
    public  static int multiply(int a, int b){
        return a*b;
    }
        
    //Divide numbers a / b
    public static int divide(int a, int b){

        //Throw an error if you try to divide by 0.
        if (b==0) {
            throw new ArithmeticException("You cannot divide by 0");
        }
        return a/b;
    }
     //ADD COMMENT TO MAKE A MINOR CHANGE   
    public static void main(String[] args) {
        
        //Define a and b to make calculations.
        int a = 5;
        int b = 2;
        
        //Print some examples
        try{
            System.out.println("Adding: " + a + " + " + b + " = " + add(a,b));
            System.out.println("Subtract: " + a + " - " + b + " = " + subtract(a,b));
            System.out.println("Multiply: " + a + " * " + b + " = " + multiply(a,b));
            System.out.println("Divide: " + a + " / " + b + " = " + divide(a,b));
        }catch (ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        } 
        
    }
}
