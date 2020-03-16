package mypackage;

import java.util.Random;
import java.util.Scanner;

public class Seats {

    public static void main(String[] args) {
        System.out.println("How many rows does the class have?");
        Scanner input = new Scanner(System.in);
        int row = Integer.parseInt(input.nextLine());
        System.out.println("How many students does the class have?");
        int numberOfStudents = Integer.parseInt(input.nextLine());
        int column = (numberOfStudents / row);

        int i;
        int j;
        int[][] planOfSeats = new int[row][column];

        if (numberOfStudents % row == 0) {
            System.out.println("\nThe Matrix is :");
            for (i = 0; i < row; i++) {
                for (j = 0; j < column; j++) {
                    System.out.print(planOfSeats[i][j] + "\t");
                    planOfSeats[i][j] = input.nextInt();
                }
            }
            System.out.print("\n");

        } else if (numberOfStudents % row != 0) {
            for (i = 0; i < row + 1; i++) {
                for (j = 0; j < column; j++) {
                    planOfSeats[i + 1][j] = input.nextInt();
                    System.out.println(planOfSeats[i + 1][j] + "\t");
                }
            }
        }
        
                
        Random rnd = new Random();
        int min = 2;//at least 2 students 
        int max = numberOfStudents;
        int range=max-min;
        
       
        Scanner input1 = new Scanner(System.in);
        String studentName = input1.next();
        int seat = rnd.nextInt(range);
        
        if ((seat==0)||(seat<numberOfStudents)){
        System.out.println("Please enter a student's name for " +seat);
        System.out.println("There are " +(numberOfStudents-seat)+ "left");
        
        }else
                System.out.println("Thank you. No left seats");
        
        String [][] finalSeats = new String [row][column];
        int k;
        int l;
        for (k=0;k<row;k++){
            for(l=0;l<column;l++){
        } 
            finalSeats [k][l]=studentName;
       System.out.println ("\nThe seating plan of the class is :" +finalSeats[k][l] +"\t" );
      
        
        

         

       
    }
    }
    
}


/*if (numberOfStudents%row==0){
           
        }else if (numberOfStudents%row!=0){
            System.out.println("Add the extra seat to the last column");
        }        
                         
                   
       
     */
// }else if(numberOfStudents%row !=0){
//  System.out.println("Put the extra seats on the last row.");
//  System.out.println("***Seating plan***");
/*
        int [][] seating = new int[row][column];
        for(int i=0;i<row;i++){
            for (int j =0; i<column; j++){
            System.out.println(seating[i][j]);
            
            }
        }
        
        
        
        
        //int i;
    
        //for(i=1; i<=row;i++){
        //System.out.println(seating[i][column]);
        
 */
