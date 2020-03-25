package mypackage;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your date of birth (dd-MM-yyyy)");
        String birthDate = input.next();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dateOfBirth = LocalDate.parse(birthDate, formatter);
        System.out.println("You date Of birth is: " +dateOfBirth);
        LocalDate currentDate = LocalDate.now();
        System.out.println("Now is: " + currentDate);

        Period period = Period.between(currentDate, dateOfBirth);
        int daysL = period.getDays() / 365;
        System.out.println("The daysL are : " +daysL);

    }

}
