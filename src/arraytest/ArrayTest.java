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
    
 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         //ArrayTest storedNumber = new ArrayTest();
        
        // Object for the ArrayMethods Class
        ArrayMethods array = new ArrayMethods();
         
        //int arrayNum[] = new int [10];
        
        // The arrayNum attribute is set to public in on order to access it globally
        int arraySize[] = ArrayMethods.arrayNum;
        
        for (int i = 0;i < arraySize.length; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Please enter an integer: "));
            //ArrayTest.setArrayNum(arrayNum);
            ArrayMethods.setArrayNum(i, num);
        }
        
        //int userArray[] = ArrayTest.getArrayNum();
        
        ArrayMethods.UserChoice();
        
        ArrayMethods.DisplayInteger();
        
        ArrayMethods.DisplayReverse();
        
        ArrayMethods.SumOfIntegers();
        
    }
}
