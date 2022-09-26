package a1;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDriver {
    public static void main(String[] args) throws IOException {

        try {
            Scanner sc = new Scanner(System.in);  //takes in file
            String filen = "";
            //String cont="";
            System.out.print("File Name: ");
            filen = sc.nextLine();   //Scanner for file input
            File input = new File(filen);
            Scanner scan = new Scanner(input);  //holds txt files
            LinkedList<String> li = new LinkedList<String>(); //initialization ofLL
            String u1= scan.nextLine(); //user input to run commands

            System.out.print("Enter a command:"); //prints contents
            while(u1 != null){

                String user = sc.nextLine();
                li.add(filen); //initializes txt file into LinkedList


                if( user.equals("p")) {
                    System.out.print("The List is:");
                    System.out.println(u1);
                    System.out.print("Enter a command:"); //extremely messy code; unsure of where to place
                }

                else if(user.equals("l")){
                    SortedLinkedList length = new SortedLinkedList();
                    System.out.println("The length is: "+ length.getLength(filen));
                    System.out.print("Enter a command:");
                }
                else if(user.equals("q")){
                    System.out.println("Exiting the program...");
                    break;
                }

            }

        } catch (Exception e){ //Catches exception
            System.err.println("Error: " + e.getMessage());

        }








    }
}
