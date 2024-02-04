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
// GitHub Link https://github.com/Edisquall/caProjectone
public class CaProjectone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            //Reading registrantion details from the file
            Scanner sc = new Scanner(new FileReader("C:\\Users\\Edi\\Documents\\NetBeansProjects\\caProjectone\\student.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("status.txt"));

            //reading first line - Stundent name
            boolean flag = true;
            while (sc.hasNextLine()) {
                flag = true;
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
                    flag = false;
                }
                // Making sure second name has only letters and numbers
                if (!splitString[1].matches(".*[.,+*?^$()\\[\\]{}|@].*")) {
                    System.out.println("Valid name");
                } else {
                    System.out.println("Second name must be only letters and numbers");
                    flag = false;
                }

                //Working on a number os classes
                classesNum = Integer.parseInt(classes);

                // Making sure that the number of classes is valid
                if (classesNum >= 1 && classesNum <= 8) {
                    System.out.println("Valid number of classes");
                } else {
                    System.out.println("Number of classes must be between 1 and 8");
                    flag = false;
                }

                // Working on registratio  number
                if (registration.length() > 6) {
                    System.out.println("Correct registration");
                } else {
                    System.out.println("Your registration is missing numbers or letters");
                    flag = false;
                }
                // Separating the first 2 character to specify as a letter
                String firstTwo = registration.substring(0, 2);

                // Separating the third and fifth character to specify as a number
                String thirdFourth = registration.substring(2, 4);

                // Separating the first fifth character to specify as a letter or number
                String fifth = registration.substring(4, 5);
                //Making sure that the end of the student registration is only numbers
                String sixthForward = registration.substring(5, registration.length());

                //Rulling to make sure the registration is valid */
                boolean validation1 = firstTwo.matches("[0-9]+");
                boolean validation2 = thirdFourth.matches("[a-zA-Z]+");
                boolean validation3 = fifth.matches("[0-9]+") || fifth.matches("[a-zA-Z]+");
                boolean validation4 = sixthForward.matches("[0-9]+");
                if (!validation1) {
                    System.out.println("First 2 characters must be a number.");
                    flag = false;
                }
                if (!validation2) {
                    System.out.println("Third and fifth characters must be letter");
                    flag = false;
                }
                if (!validation3) {
                    System.out.println("Fifth character must be a letter or a nunber");
                    flag = false;
                }
                if (!validation4) {
                    System.out.println("The following characters must be number");
                    flag = false;
                } else {
                    System.out.println("Student number is valid");
                }
                //Workload
                String workLoad = "";
                if (classesNum == 1) {
                    workLoad = "Very Light";
                } else if (classesNum == 2) {
                    workLoad = "Light";
                } else if (classesNum >= 3 && classesNum <= 5) {
                    workLoad = "Part Time";
                } else if (classesNum >= 6) {
                    workLoad = "Full Time";
                }

                //Verifying and write the details in the doc.
                if (flag) {
                    bw.write(registration + " - " + splitString[1] + "\n" + workLoad + "\n");
                }
                //Challenge one - Make sure that the year in the registration is 2020 or more
                int parsedFirstTwo = Integer.parseInt(String.valueOf(firstTwo));
                boolean validationYear = (parsedFirstTwo >= 20);
                if (!validationYear) {
                    System.out.println("Registraion year must be 2020 or more");
                }

                // Second challege make sure that the numbers after the letters are reasonable 1 -200
                String restNum = registration.substring(3, registration.length());
                String onlyNum = restNum.replaceAll("[A-zA-Z]+", "");
                int parsedRestNum = Integer.parseInt(String.valueOf(onlyNum));
                boolean resonableValidation = (parsedRestNum >= 1 && parsedRestNum <= 200);

                if (!resonableValidation) {
                    System.out.println("Number should be be between 1 and 200");
                }
            }
            sc.close();

            bw.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        // I tried to make the challenge 3 but I was not able to go forward
        // Challange 3 getting info from console
//        try {
//            Scanner scan = new Scanner(System.in);
//            boolean flag2 = true;
//            System.out.println("Please digit 1 if you want to write the info on the file and 2 if you want to write the information on console.");
//            int studentInfo = scan.nextInt();
//            if (studentInfo == 2) {
//                System.out.println("Follow the questions below");
//            } if (studentInfo == 1) {
//                System.out.println("Please add the information in the file Status");
//                flag2 = false;
//            } else {      
//            }
//          
//                System.out.println("Please write your name.");
//                String StudentName = scan.nextLine();
//                if (StudentName.matches("[a-zA-Z]+")) {
//                    System.out.println("Valid name");
//                } else { 
//                    System.out.println("First name must be only letters");
//                    flag2 = false;
//                }
//            System.out.println("Please write your name.");
//            String StudentName = scan.nextLine();
//            
//            
//            
//            System.out.println("Please write your surname.");
//            String StudentSurname = scan.nextLine();
//            System.out.println("Please write number of class.");
//            String NunberOfClass = scan.nextLine();
//            System.out.println("Please write your Student Number.");
//            String StudentNum = scan.nextLine();
//                }catch (Exception e) {
//            System.out.println(e);
        }

            

        }
