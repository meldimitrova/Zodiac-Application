/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zodiacapplication;

import java.util.Scanner;

/**
 *
 * @author Melina Dimitrova
 */
public class ZodiacSigns {

    public int day;
    public String month;

    public ZodiacSigns(int d, String m) {
        this.day = d;
        this.month = m;
    }

    // Initialise the day and month variables
    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    // Method to determine which zodiac sign it is
    public String whichSign() {
        String sign = "";
        int d = day;
        String m = month;
        switch (m) {
            case "January":
                if (d < 20) {
                    sign = "Capricorn";
                } else {
                    sign = "Aquarius";
                }
                break;
            case "February":
                if (d < 19) {
                    sign = "Aquarius";
                } else {
                    sign = "Pisces";
                }
                break;
            case "March":
                if (d < 21) {
                    sign = "Pisces";
                } else {
                    sign = "Aries";
                }
                break;
            case "April":
                if (d < 20) {
                    sign = "Aries";
                } else {
                    sign = "Taurus";
                }
                break;
            case "May":
                if (d < 21) {
                    sign = "Taurus";
                } else {
                    sign = "Gemini";
                }
                break;
            case "June":
                if (d < 21) {
                    sign = "Gemini";
                } else {
                    sign = "Cancer";
                }
                break;
            case "July":
                if (d < 23) {
                    sign = "Cancer";
                } else {
                    sign = "Leo";
                }
                break;
            case "August":
                if (d < 23) {
                    sign = "Leo";
                } else {
                    sign = "Virgo";
                }
                break;
            case "September":
                if (d < 23) {
                    sign = "Virgo";
                } else {
                    sign = "Libra";
                }
                break;
            case "October":
                if (d < 23) {
                    sign = "Libra";
                } else {
                    sign = "Scorpio";
                }
                break;
            case "November":
                if (d < 22) {
                    sign = "Scorpio";
                } else {
                    sign = "Sagittarius";
                }
                break;
            case "December":
                if (d < 22) {
                    sign = "Saggitarius";
                } else {
                    sign = "Capricorn";
                }
                break;
            default:
                break;
        }
        return sign;
    }
    
    // Method to assign element according to the signs
    public String elements(){
        String sign = whichSign();
        String element = "";
        if(sign == "Aries" || sign == "Leo" || sign == "Sagittarius"){
            element = "Fire";
        }
        else if(sign == "Taurus" || sign == "Virgo" || sign == "Capricorn"){
            element = "Earth";
        }
        else if(sign == "Gemini" || sign == "Libra" || sign == "Aquarius"){
            element = "Air";
        }
        else if(sign == "Cancer" || sign == "Scorpio" || sign == "Pisces"){
            element = "Water";
        }
        return element;
    }

    // To-String - to be used in the driver code
    @Override
    public String toString() {
        return "The zodiac sign for " + getDay() + " " + getMonth() + " is " + whichSign()
                + "\nThe element is " + elements();
    }
    
    public static void main(String[] args) {
        // Driver code for Zodiac Signs
        ZodiacSigns z = new ZodiacSigns(2,"February");
        System.out.println(z.toString());
        
        Scanner d = new Scanner(System.in);
        System.out.println("Enter day: ");
        int day = d.nextInt();
        Scanner m = new Scanner(System.in);
        System.out.println("Enter month name: ");
        String month = m.nextLine();
        
        ZodiacSigns z1 = new ZodiacSigns(day, month);
        System.out.println(z1.toString());
    }

}
