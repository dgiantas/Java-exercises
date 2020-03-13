/*
 Write a Java program to print the result of the following operations for x = 1 and y =2. 
After every operation print the result of the whole operation, x and y.
a. -x + x++ * 2
b. (x++ + --y) + --y
c. x + x
At the end, after all the operations print the values of x and y. 
 */
package mypackage;

import java.util.Scanner;


public class MainClass {

  
    public static void main(String[] args) {
        int x=1;
        int y=2;
        
        int a = -x + x++ *2;
        int b = (x++ + --y) + --y;
        int c = (x++ +y) + --y;
        int d = x + x;
        
        System.out.println(a);
        System.out.println(x);
       
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);
        
        System.out.println(c);
        System.out.println(x);
        System.out.println(y);
        
        System.out.println(d);
        
        System.out.println(x);
        System.out.println(y);
        
        
        
        
        /*Write a Java program to print the area and perimeter of a rectangle. 
Test Data:
Width = 5.5 Height = 8.5
Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20 */
        
        double width = 5.5;
        double height = 8.5;
        
        double area = width * height;
        double perimeter = 2* (width + height);
        
        System.out.println("Area is "+area);
        System.out.println("Perimeter is "+ perimeter);

        
        
/*Write a Java program to print the area and perimeter of a circle. 
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586 
Use memory-friendly variables and print the result with printf.*/       
        
    
    
        double radius = 7.5;
        double perimeterOfCyrcle = 2*Math.PI * radius;
        double areaOfCyrcle = Math.PI * radius * radius;
    
        System.out.printf("Area of cyrcle is %f\n", areaOfCyrcle);
        System.out.printf("Perimeter of cyrcle is %f\n", perimeterOfCyrcle);
       
        
        
        //Write a Java program to convert temperature from Fahrenheit to Celsius degree.
        //T = 9*T/5 + 32
       //'T' is the temperature on the Celsius scale.
        
       Scanner input = new Scanner(System.in);
       System.out.println("Enter temperature in Fahrenheit");
        double fahrenheit = input.nextDouble();
        double celsius = 5*(fahrenheit-32.0)/9;
        System.out.printf("The temperature in Celsius is " +celsius);}
        
        
        //Write a java program that converts inches to metres.
        //1 inch is 0,00254 metres.
        
        System.out.println("Enter a number of inches");
        Scanner input2 = new Scanner(System.in);
        double inch = input2.nextDouble();
        double metres = inch * 0.0254;
        
        System.out.println("Inch is"+ inch + "Metres is "+metres);
        
        
        
        
        
      
    }





       
    
    

