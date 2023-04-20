/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zodiacapplication;

import java.util.Scanner;

/**
 *
 * @author Melina Dimitrova
 */
public class ZodiacApplication {

    public static void main(String[] args) {
        // Scanner to get input for DoB

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date of birth (dd/m/yyyy): ");
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();
        
        // Switch-case statement to convert month number to its name
        String mon = "";
        switch (m) {
            case 1:
                mon = "January";
                break;
            case 2:
                mon = "February";
                break;
            case 3:
                mon = "March";
                break;
            case 4:
                mon = "April";
                break;
            case 5:
                mon = "May";
                break;
            case 6:
                mon = "June";
                break;
            case 7:
                mon = "July";
                break;
            case 8:
                mon = "August";
                break;
            case 9:
                mon = "September";
                break;
            case 10:
                mon = "October";
                break;
            case 11:
                mon = "November";
                break;
            case 12:
                mon = "December";
                break;
            default:
                break;
        }

        // Output the zodiac signs for the given date of birth
        ZodiacSigns z = new ZodiacSigns(d, mon);
        ChineseZodiac c = new ChineseZodiac(y);
        
        String dOB = d + "/" + m + "/" + y; 
        System.out.println("Date of birth is " + dOB + "\n" + z.toString() 
                + "\n" + c.toString());
        
    }

}
