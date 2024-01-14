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
            String data1 = sc.nextLine();
            
            
            
            String data2 = sc.nextLine();
            System.out.println(data2);
        }  
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
