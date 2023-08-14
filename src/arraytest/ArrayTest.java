/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraytest;
import javax.swing.JOptionPane;
import java.util.Arrays;
/**
 *
 * @author lab_services_student
 */
public class ArrayTest {
    
    private static int arrayNum[] = new int [10];

    public ArrayTest() {
    }

    public static int[] getArrayNum() {
        return arrayNum;
    }
    
    public static void setArrayNum(int[] arrayNum) {
        ArrayTest.arrayNum = arrayNum;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         ArrayTest storedNumber = new ArrayTest();
         //int arrayNum[] = new int [10];
        
        for (int i = 0;i < arrayNum.length; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Please enter an integer: "));
            ArrayTest.setArrayNum(arrayNum);
        }
        
        int userArray[] = ArrayTest.getArrayNum();
        
        
        boolean choice = true;
        // int choice = Integer.parseInt(JOptionPane.showInputDialog(""));
        //int menuChoice = Integer.parseInt(JOptionPane.showInputDialog(""));
        
        while (choice) {
          int menuChoice = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                        ************************ WOULD YOU LIKE TO ************************
                                                                        ===================================================================
                                                                        
                                                                        1. Display all the integer values 
                                                                        2. Display all the integers in reverse order
                                                                        3. Display the sum of the integers
                                                                        4. Display all the values 
                                                                        5.
                                                                        99. End"""));  
          switch (menuChoice) {
            case 1:
              JOptionPane.showMessageDialog(null,"End of Program");
            }
            if (menuChoice == 99) {
              choice = false;
              JOptionPane.showMessageDialog(null,"End of Program");
            }
            if (menuChoice == 99) {
              choice = false;
              JOptionPane.showMessageDialog(null,"End of Program");
            }
            if (menuChoice == 99) {
              choice = false;
              JOptionPane.showMessageDialog(null,"End of Program");
            }
        }
    }
    
}
