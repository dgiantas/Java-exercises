package mypackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import static mypackage.Android.androidPrice;
import static mypackage.NonAndroid.nonAndroidPrice;

public class MainClass {

    public static void main(String[] args) {

        System.out.println("Please choose a brand for your phone, android or not android.");
        Scanner input = new Scanner(System.in);
        String brand = input.next();
        System.out.println("Is is an android phone? Please enter (1) for Yes or (2) for No");
        int choice = input.nextInt();
        if (choice == 1) {
            Android phone = new Android(brand, androidPrice);
            System.out.println("The brand of your phone is: " + phone.getBrand() + " and the price is: " + phone.getPrice());
        } else {

            NonAndroid phone = new NonAndroid(brand, nonAndroidPrice);
            System.out.println("The brand of your phone is : " + phone.getBrand() + " and the price of your phone is: " + phone.getPrice());

        }
        Phone listOfPhones[] = new Phone[10];

        Android phone1 = new Android("Samsung", androidPrice);
        Android phone2 = new Android("Huawei", androidPrice);
        Android phone3 = new Android("Iphone", androidPrice);
        Android phone4 = new Android("Asus", androidPrice);
        NonAndroid phone5 = new NonAndroid("Nokia", nonAndroidPrice);
        NonAndroid phone6 = new NonAndroid("LG", nonAndroidPrice);
        NonAndroid phone7 = new NonAndroid("Blackview", nonAndroidPrice);
        NonAndroid phone8 = new NonAndroid("Sony Ericsson", nonAndroidPrice);
        NonAndroid phone9 = new NonAndroid("Nokia", nonAndroidPrice);
        NonAndroid phone10 = new NonAndroid("Motorola", nonAndroidPrice);

        listOfPhones[0] = phone1;
        listOfPhones[1] = phone5;
        listOfPhones[2] = phone3;
        listOfPhones[3] = phone4;
        listOfPhones[4] = phone10;
        listOfPhones[5] = phone9;
        listOfPhones[6] = phone8;
        listOfPhones[7] = phone2;
        listOfPhones[8] = phone7;
        listOfPhones[9] = phone6;
        System.out.println("The list of the phones is: " + Arrays.toString(listOfPhones));

    }
}
