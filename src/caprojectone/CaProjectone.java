/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caprojectone;

import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Edi
 */
public class CaProjectone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new FileReader("C:\\Users\\Edi\\Documents\\NetBeansProjects\\caProjectone\\student.txt"));
            //Reading registrantion details from the file
            
             while (sc.hasNextLine()) {
            String data = sc.nextLine();
              //reading first line - Stundent name
              
            String classes = sc.nextLine();
            //reading second line - Number of classes
            
            String registration = sc.nextLine();
            //reading third line - Registration number
            
            int classesNum;
            String[] splitString = data.split(" ");
            //Splitting first name from the second name
            
            if (splitString[0].matches("[a-zA-Z]+")) {
                System.out.println("Valid name");
            } else {
                System.out.println("First name must be only letters");
                //Making sure first name has only letters
            }
            if (!splitString[1].matches(".*[.,+*?^$()\\[\\]{}|@].*")) {
                System.out.println("Valid name");
            } else {
                System.out.println("Second name must be only letters and numbers");
            } // Making sure second name has only letters and numbers
            
            //Working on a number os classes
            
            classesNum = Integer.parseInt(classes);
            if (classesNum < 8 && classesNum >1) {
                 System.out.println("Valid number os classes");
             } else if (classesNum == 1 && classesNum == 8) {
                 System.out.println("Valid number os classes");
             }
            else {
                     System.out.println("Number of classes must be 1 to 8");
                     } // Making sure that number of classes are valid
            
            // Working on registratio  number
            
            if (registration.length() < 6) {
            System.out.println("Correct registration");
        } else {
                System.out.println("Incorrect registration");
            } 
            String first2 = registration.substring(0, 1);
            // Separating the first 2 character to specify as a letter
            
            String first3 = registration.substring(2, 3);
            // Separating the third and fourth character to specify as a number
            
            String first4 = registration.substring(4);
            // Separating the first fifth character to specify as a letter or number
            
            if (first2.matches("[0-9]+")) {
                System.out.println("First 2 characters are numbers");
            } else if (first3.matches("[a-zA-Z]+")) {
                System.out.println ("Third and fourth character must be letter");
            } else if (first4.matches ("[0-9]+") || (first4.matches ("[a-zA-Z]+"))) {
                System.out.println ("Fifth character must be a letter or a nunnber");
            }
            else { System.out.println("Incorrect registration");
            }
            //Rulling to make sure the registration is valid
            
            
            
            
        }  
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
