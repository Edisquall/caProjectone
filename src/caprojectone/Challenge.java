/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
public class Challenge {

     public static void main(String[] args) {
        try {
            //Reading registrantion details from the file
            Scanner sc = new Scanner(new FileReader("C:\\Users\\Edi\\Documents\\NetBeansProjects\\caProjectone\\student.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("status.txt"));

        //reading first line - Stundent name
        while (sc.hasNextLine()) {
            String registration = sc.nextLine();
            
             // Separating the first 2 character to specify as a letter
                String firstTwo = registration.substring(0, 2);

                // Separating the third and fifth character to specify as a number
                String thirdFourth = registration.substring(2, 4);

                // Separating the first fifth character to specify as a letter or number
                String fifth = registration.substring(4, 5);
                //Making sure that the end of the student registration is only numbers
                String sixthForward = registration.substring(5, registration.length());
                
             //Challenge one - Make sure that the year in the registration is 2020 or more
                int parsedFirstTwo = Integer.parseInt(String.valueOf(firstTwo));
                boolean validationYear = (parsedFirstTwo >= 20);
                 if (!validationYear) {
                    System.out.println("Registraion year must be 2020 or more");
                 }
                 
                 // Second challege make sure that the numbers after the letters are reasonable 1 -200
                 String restNum = registration.substring(2, registration.length());
                 String onlyNum = restNum.replaceAll("[A-zA-Z]+","");
                 int parsedRestNum = Integer.parseInt(String.valueOf(restNum));
                 boolean resonableValidation = (parsedRestNum>= 1 && parsedRestNum <= 200);
                 
                 if (!resonableValidation) {
                     System.out.println ("Number should be be between 1 and 200");
                 }

        }
        bw.close();
        sc.close();
    } catch (Exception e) {
            System.out.println(e);
    }
}
}