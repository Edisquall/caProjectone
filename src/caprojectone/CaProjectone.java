/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caprojectone;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
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
            //Reading registrantion details from the file
            Scanner sc = new Scanner(new FileReader("C:\\Users\\Edi\\Documents\\NetBeansProjects\\caProjectone\\student.txt"));

            //Writting valid data to a file
            BufferedWriter bw = new BufferedWriter(new FileWriter("status.txt"));
            
           
            //reading first line - Stundent name
            while (sc.hasNextLine()) {
                String data = sc.nextLine();

                //reading second line - Number of classes
                String classes = sc.nextLine();

                //reading third line - Registration number
                String registration = sc.nextLine();

                //Splitting first name from the second name
                int classesNum;
                String[] splitString = data.split(" ");

                //Making sure first name has only letters
                if (splitString[0].matches("[a-zA-Z]+")) {
                    System.out.println("Valid name");
                } else {
                    System.out.println("First name must be only letters");
                }
                // Making sure second name has only letters and numbers
                if (!splitString[1].matches(".*[.,+*?^$()\\[\\]{}|@].*")) {
                    System.out.println("Valid name");
                } else {
                    System.out.println("Second name must be only letters and numbers");
                }

                //Working on a number os classes
                classesNum = Integer.parseInt(classes);
                // Making sure that number of classes are valid
                if (classesNum < 8 && classesNum > 1) {
                    System.out.println("Valid number the classes");
                } else if (classesNum == 1 && classesNum == 8) {
                    System.out.println("Valid number the classes");
                } else {
                    System.out.println("Number of classes must be 1 to 8");
                }

                // Working on registratio  number
                if (registration.length() > 6) {
                    System.out.println("Correct registration");
                } else {
                    System.out.println("Your registration is missing numbers or letters");
                }
                // Separating the first 2 character to specify as a letter
                String firstTwo = registration.substring(0, 2);

                // Separating the third and fourth character to specify as a number
                String thirdFourth = registration.substring(2, 4);

                // Separating the first fifth character to specify as a letter or number
                String fourth = registration.substring(4, 5);
                //Making sure that the end of the student registration is only numbers
                String sixthForward = registration.substring(5, registration.length());

                //Rulling to make sure the registration is valid */
                boolean validation1 = firstTwo.matches("[0-9]+");
                boolean validation2 = thirdFourth.matches("[a-zA-Z]+");
                boolean validation3 = fourth.matches("[0-9]+") || fourth.matches("[a-zA-Z]+");
                boolean validation4 = sixthForward.matches("[0-9]+");
                if (!validation1) {
                    System.out.println("First 2 characters must be a number.");
                } else {
                    System.out.println("Student number is valid");
                    //writting to the file
                    bw.write(firstTwo);
                }
                if (!validation2) {
                    System.out.println("Third and fourth characters must be lette");
                } else {
                    System.out.println("Student number is valid");
                     //writting to the file
                    bw.write(thirdFourth);
                }
                if (!validation3) {
                    System.out.println("Fifth character must be a letter or a nunber");
                } else {
                    System.out.println("Student number is valid");
                     //writting to the file
                    bw.write(fourth);
                }
                if (!validation4) {
                    System.out.println("The following characters must be number");
                } else {
                    System.out.println("Student number is valid");
                     //writting to the file
                    bw.write(sixthForward);
                    bw.close();
                }
                
                //Verifying the amount of classes
                
                
                
            }
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        

    }

}
