
package practiceofweekend;

import java.util.Scanner;


public class PracticeOfWeekend {

    
    public static void main(String[] args) {
        
        System.out.println("What is your age?");
        Scanner input=new Scanner(System.in);
        int age = input.nextInt();
        
        if (age>0){
            if (age>=5 && age<12){
                System.out.println("Your age is " + age+ " and are attending primary school");
            }else if (age>=12 && age<15){
                System.out.println("Your age is "+age + " and you are attending secondary school");
            }else if (age>=15 && age<18){
                System.out.println("Your age is " + age+ " and are attending high school");
            }else if (age>=18){
                System.out.println("Your age is " + age+ " and are attending college/university");
            }else 
                System.out.println("Your age is " + age+ " and are are not attending school yet");
            
        }else
            System.out.println("Please give me a valid number");
       
        
        
        
        
        // What to do every day (switch). Monday-Friday: go to work. Sat-Sun: relaxing
        System.out.println("Choose a day from Monday till Sunday.");
        
        Scanner input2 = new Scanner(System.in);
        String day = input2.next();
        
        switch (day) {
    
    case "Monday":
    case "Tuesday":
    case "Wednesday":
    case "Thursday":
    case "Friday":
    System.out.println("Go to work");
    break;
    
    case "Saturday":
    case "Sunday":
    System.out.println("Relax");
    break;
    
    default:
    System.out.println("Invalid");
    
    //What season is according to month. Enter month from terminal.
    
    int month = Integer.parseInt(args[0]);
    
    switch (month) {
        case 1:
        case 2:
            System.out.println("The season is winter.");
            break;
        case 3:    
        case 4: 
        case 5:
            System.out.println("The season is spring.");
            break;
        case 6:  
        case 7:
        case 8:
            System.out.println("The season is summer.");
            break;
        case 9:
        case 10:   
        case 11:
            System.out.println("The season is autumn.");
            break;
        case 12:
            System.out.println("The season is winter.");
            break;
            
        default:
            System.out.println("invalid");   
        }
        
    }
        
     
        
         //Print the number of days each month has. Use switch.
System.out.print(" Please Enter Month Number from 1 to 12 (1 = Jan, and 12 = Dec) : ");
Scanner input3 = new Scanner(System.in);
int month = input.nextInt();


switch (month){
    case 1:
        System.out.println("January has 31 days");
        break;
    case 2:
        System.out.println("February has 28 days");
        break;
    case 3:
        System.out.println("March has 31 days");
        break;
    case 4:
        System.out.println("April has 30 days");
        break;
    case 5:
        System.out.println("May has 31 days");
        break;
    case 6:
        System.out.println("June has 31 days");
        break;
    case 7:
        System.out.println("July has 30 days");
        break;
    case 8:
        System.out.println("August has 31 days");
        break;
    case 9:
        System.out.println("September has 30 days");
        break;
    case 10:
        System.out.println("October has 31 days");
        break;
    case 11:
        System.out.println("November has 30 days");
        break;
    case 12:
        System.out.println("December has 31 days");
        break;
    default:
        System.out.println("invalid");
        
    }

//Get message ("Perfect, Good, Pass, Fail") based on grade (A, B, C-D, the rest). 

System.out.println("Please enter a grade from A, B, C, D and F");
Scanner input4 = new Scanner(System.in);
String grade = input4.next();
char grade2 = grade.charAt(0);

switch (grade2){
    case 'A':
        System.out.println("Excellent");
        break;
    case 'B':
        System.out.println("Good");
        break;
    case 'C':
        System.out.println("Fair");
        break;
    case 'D':
        System.out.println("Unsatisfactory");
        break;
    case 'F':
        System.out.println("Fail");
        break;
    default:
        System.out.println("invalid");
    }

/*Based on age what can you do?
lt 16>>You cannot drive
16-17>>You can drive but not vote
18-21>>You can vote but not drink
gt 22>>You can do anything */

System.out.println("How old are you?");
Scanner input5= new Scanner(System.in);
int yourAge = input5.nextInt();

if (yourAge <= 16){
    System.out.println("You cannot drive");}
else if (yourAge <=17){
    System.out.println("You can drive but not vote");}
else if (yourAge <=21){
    System.out.println("You can vote but not drink");
}else if (yourAge ==22){
    System.out.println("You can do anything");
}


/* Program should ask your weight and planet. Compute your weight on the planet based on the table below:
#    Planet    Relative gravity
1    Venus        0.78
2    Mars        0.39
3    Jupiter    2.65
4    Saturn    1.17
5    Uranus    1.05
6    Neptune    1.23
So, for example, if your weight is 80 kg on earth, 
then you would weigh just over 31 kg on Mars, since Mars' gravity is 0.39 times earth's gravity. 
(80 * 0.39 is 31.20)
*/

System.out.println("How much do you wieght in kgs?");
Scanner input6 = new Scanner (System.in);
double yourWeight = input6.nextDouble();
System.out.println("Choose one planet from 1-6: 1.Venus, 2.Mars, 3.Jupiter, 4.Saturn, 5.Uranus and 6.Neptune");
Scanner input7 = new Scanner(System.in);
int planetChoice = input7.nextInt();


switch(planetChoice){
    case 1:
        System.out.println("You weight on Venus is :" +(yourWeight*0.78));
        break;
    case 2:
        System.out.println("You weight on Mars is :" +(yourWeight*0.39));
        break;
    case 3:
        System.out.println("You weight on Jupiter is :" +(yourWeight*2.65));
        break;
    case 4:
        System.out.println("You weight on Saturn is :" +(yourWeight*1.17));
        break;
    case 5:
        System.out.println("You weight on Uranus is :" +(yourWeight*1.05));
        break;
    case 6:
        System.out.println("You weight on Neptun is :" +(yourWeight*1.23));
        break;
    default:
        System.out.println("invalid");

}    

//Use ternary to return a message child or adult. Older than 18 is adult.

System.out.println("How old are you?");
Scanner input8 = new Scanner(System.in);
int ageOf = input8.nextInt();
String result = (ageOf > 18)?"you are an adult":"You are a child";
System.out.println(result);

/*Create a program that stores the names of your 4 best friends in an array. 
Then print these names from the array. 
Use for-traditional, for enhanced, while, do-while. */


String [] array = new String[4];
array[0]="Benedict";
array[1]="Camille";
array[2]="Dusan";
array[3]="Helen";

for(int i=0; i<array.length;i++){
    System.out.println(array[i]);
}

int i=0;
while (i<4){
    System.out.println(array[i]);
    i++;
}    
    
for (String name:array){
    System.out.println(name);
}
int j=0;
 do {
     System.out.println(array[j]);
     j++;
 }while (j<array.length);       
}


}






    



    

    
    

