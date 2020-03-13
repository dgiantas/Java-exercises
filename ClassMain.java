package mypackage;

import java.util.Scanner;

public class ClassMain {

    myName();
    ageMethod();
    public static void main(String[] args) {
        

    static String myName() {

        System.out.println("What is your name?");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println(name);

        return name;
    }

    System.out.println (MyName ()+ "What is your gender?");
        Scanner input2 = new Scanner(System.in);
    String gender = input2.next();

    if(gender.equals ("male")){
            System.out.println("M"); }

    if(gender.equals ("female")){
    System.out.println("F");}

    static int ageMethod() {
        Scanner input3 = new Scanner(System.in);
        System.out.println(myName + " what is your age");
        int age = input3.nextInt();

        if (age >= 0 && age <= 5) {
            System.out.println("You are too young for this app");
        } else if (age >= 6 && age <= 18) {
            System.out.println("Oh you are a student");
        } else if (age >= 19 && age <= 40) {
            System.out.println("Well, you must be employed.");

            if (age == 3) {
                System.out.println("Come back in 3 years when you will be a student.");
            }
            if (age == 10) {
                System.out.println("Keep up... 8 more years left and afterwards you will make money.");
            }
            if (age == 25) {
                System.out.println("You finished school 7 years ago.");
            }
        }

        Scanner input4 = new Scanner(System.in);
        System.out.prinlnt(" What is your favorite season? You have the options: 1.Winter , 2.Spring, 3.Summer, 4.Autumn. ")
        int numberUsed = input4.nextInt();

        if (numberUsed == 1) {
            System.out.println("It must be cold outside");
        } else if (numberUsed == 2) {
            System.out.println("Ohh, flowers are very beautiful these days");

        } else if (numberUsed == 3) {
            System.out.println("Let's go for swimming");

        } else if (numberUsed == 4);
        {
            System.out.println("The tress are full of brown leaves");
        }

        Scanner input5 = new Scanner(System.in);
        System.out.println(myName() + "Give me your height in metres);
        int height = input5.nextInt();

        Scanner input6 = new Scanner(System.in);
        System.out.println(myName() + "Give me your weight in kgs");
        int weight = input6.nextInt();

        double bmi = (weight / height ^ 2);

        System.out.println("You BMI is:" + bmi);
        if (bmi < 18.5) {
            System.out.println("You are underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You have normal weight");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("You are overweight");
        } else if (bmi >= 30) {
            System.out.println("You have obesity");
        }


      public int getSum(int ageInDays){
        
       int ageInDays = (ageMethod() * 365);
       System.out.println(ageInDays);   
       
     
      int lastDigit = ageInDays%10;
       while (ageInDays !=0){
       int sum = sum+lastDigit;
       ageInDays = ageInDays/10;   
           return sum;

      }
       if sum>6{
           
           int sum2=sum%7;
           System.out.println(sum2);
       
           if sum2 = 0{
           System.out.println("You lucky number is Monday");
           
       }else if sum2=1{
           System.out.println("You lucky number is Tuesday");
       }else if sum2=2{
           System.out.println("You lucky number is Wednesday");
           
       }else if sum2=3{
           System.out.println("You lucky number is Thursday");
           
       }else if sum2=4{
           System.out.println("You lucky number is Friday");
       }else if sum2=5{
           System.out.println("You lucky number is Saturday");
           
       }else if sum2=6{
           System.out.println("You lucky number is Sunday");
      
       }
       
       }
       
           
       
           
       
      








