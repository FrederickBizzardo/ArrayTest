/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package arraytest;
import javax.swing.JOptionPane;
import java.util.Arrays;
/**
 *
 * @author lab_services_student
 */

public class ArrayMethods {
    // Attribute set to public to grant access in Main class
    public static int arrayNum[] = new int [10];

    // Empty constructor
    public ArrayMethods() {
    }

    // Setter
    public static void setArrayNum(int i, int num) {
        arrayNum[i] = num;
    }

    // Getter
    public static int getArrayNum(int i) {
        return arrayNum[i];
    }




    // Method to enable users to access the main menu interface
    public static void UserChoice() {

        // int choice = Integer.parseInt(JOptionPane.showInputDialog(""));
        //int menuChoice = Integer.parseInt(JOptionPane.showInputDialog(""));

        while (true) {
          int menuChoice = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                        ************************ WOULD YOU LIKE TO ************************
                                                                        ===================================================================
                                                                        
                                                                        1.  Display all the integer values 
                                                                        2.  Display all the integers in reverse order
                                                                        3.  Display the sum of the integers
                                                                        4.  Display all the values less than a specific number
                                                                        5.  Display all the values higher than the average
                                                                        99. End program \n\n"""));  
        // Converted switch to rule
          switch (menuChoice) {
            case 1 -> ArrayMethods.DisplayInteger();

            case 2 -> ArrayMethods.DisplayReverse();

            case 3 -> ArrayMethods.SumOfIntegers();

            case 4 -> ArrayMethods.DisplayLowerIntegers();

            case 5 -> ArrayMethods.DisplayHigherIntegers();

            case 99 -> {
                JOptionPane.showMessageDialog(null,"End of Program");
                System.exit(0);
                }

            }
        }
    }



    // Integers entered by the user method
    public static void DisplayInteger() {
        //int userArray[] = ArrayTest.getArrayNum();

        StringBuilder response = new StringBuilder("Numbers entered by the user: \n");
        for (int user : arrayNum) {
            response.append(user).append(" ");
        }
        JOptionPane.showMessageDialog(null, response.toString(), "NUMBERS ENTERED BY USER", JOptionPane.INFORMATION_MESSAGE);
    }


    // Integer in reverse format method
    public static void DisplayReverse() {
        StringBuilder responseReverse = new StringBuilder("Numbers entered by the user in reverse: \n");
        for (int rev = arrayNum.length-1; rev >= 0; rev--) { 
            int arr = arrayNum[rev];
            responseReverse.append(arr).append(" ");
            JOptionPane.showMessageDialog(null, responseReverse.toString(),"REVERSE NUMBERS" , JOptionPane.INFORMATION_MESSAGE);
        }
        //JOptionPane.showMessageDialog(null, responseReverse.toString(), "Stored Numbers", JOptionPane.INFORMATION_MESSAGE);
    }



    // Sum of integer method
    public static void SumOfIntegers() {
        int sum = 0;
        //StringBuilder responseSum = new StringBuilder("The sum of numbers entered by the user is: ");
        for (int array = 0;array < arrayNum.length; array++) {
            sum += arrayNum[array];
            //responseSum.append(array).append("");
         }
         JOptionPane.showMessageDialog(null, "The sum of all numbers:  \n" + sum, "SUM OF NUMBERS", JOptionPane.INFORMATION_MESSAGE);
    }



    // Limiting argument method
    public static void DisplayLowerIntegers() {
        String list = "The array list: \n";
        for (int i=0; i < arrayNum.length; i++) {
            list += arrayNum[i] + " ";

        }
        int limitArg = Integer.parseInt(JOptionPane.showInputDialog(list + "\nPlease enter a limiting argument: \n"));
        String lowNumb = "The integers less than " + limitArg + ": \n";

        for (int integer : arrayNum) {
            if (integer < limitArg) {
                lowNumb += integer + " ";
            }
        }
        JOptionPane.showMessageDialog(null, lowNumb);
    }   



    //  Average method
    public static void DisplayHigherIntegers() {
        int avgSum = 0;
         //StringBuilder responseSum = new StringBuilder("The sum of numbers entered by the user is: ");
        for (int array = 0;array < arrayNum.length; array++) {
            avgSum += arrayNum[array];
        }   
        // (double) For double conversion. From integer to double
        double avg = (double) avgSum / arrayNum.length;

        String highVal = "The sum of all numbers: \n" + avgSum +
                "\n\nThe Array size: \n" + arrayNum.length +
                "\n\nThe average of all numbers: \n" + avg +
                "\n\nThe highest values of all numbers: \n";

        for (int average : arrayNum) {
            if (average > avg) {
                highVal += average + " ";
            }
        }


        JOptionPane.showMessageDialog(null, highVal, "AVERAGE", JOptionPane.INFORMATION_MESSAGE);
         //int avg = Integer.parseInt(JOptionPane.showInputDialog("Please enter a "));
    }
}