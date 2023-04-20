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
public class ChineseZodiac {
    public int year;
    
    public ChineseZodiac(int y){
        this.year = y;
    }

    // Initialise the year variable
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    // Method to determine what year is which animal
    public String whichAnimal() {
        String animal = "";
        int y = year;
        switch (y % 12) {
            case 0:
                animal = "Monkey";
                break;
            case 1:
                animal = "Rooster";
                break;
            case 2:
                animal = "Dog";
                break;
            case 3:
                animal = "Pig";
                break;
            case 4:
                animal = "Rat";
                break;
            case 5:
                animal = "Ox";
                break;
            case 6:
                animal = "Tiger";
                break;
            case 7:
                animal = "Rabbit";
                break;
            case 8:
                animal = "Dragon";
                break;
            case 9:
                animal = "Snake";
                break;
            case 10:
                animal = "Horse";
                break;
            case 11:
                animal = "Goat";
                break;
            default:
                break;
        }
        return animal;
    }
    
    // Method to determine the element for the specific year using modulo operator to find last digit
    public String whichElement(){
        int y = year;
        String element = "";
        int lastDigit = y % 10;
        
        switch (lastDigit) {
            case 0:
            case 1:
                element = "Metal";
                break;
            case 2:
            case 3:
                element = "Water";
                break;
            case 4:
            case 5:
                element = "Wood";
                break;
            case 6:
            case 7:
                element = "Fire";
                break;
            case 8:
            case 9:
                element = "Earth";
                break;
            default:
                break;
        }
        return element;
    }
    
    @Override
    public String toString() {
        return "The Chinese zodiac sign for " + getYear() + " is " + whichAnimal()
                + " and the element is " + whichElement();
    }
    
    public static void main(String[] args) {
        // Driver code for Zodiac Signs
        ChineseZodiac c = new ChineseZodiac(1986);
        System.out.println(c.toString());
        
        int year;
        try (Scanner y = new Scanner(System.in)) {
            System.out.println("Enter year: ");
            year = y.nextInt();
        }
        
        ChineseZodiac c1 = new ChineseZodiac(year);
        System.out.println(c1.toString());
    }
}
