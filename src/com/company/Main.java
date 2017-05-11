package com.company;

import java.io.IOException;
import java.util.*;
import java.io.*;

public class Main  {

    public static void main(String[] args) throws IOException{

        File textInput = new File("rawDataU6 (1).txt");
        Scanner scan = new Scanner(textInput);
        scan.useDelimiter("\t,");

        String[] lON = new String[1000]; //lON = list of names
        int maxIndex = -1;
        ArrayList<String> funky = new ArrayList<String>();


        while(scan.hasNext()) {
            maxIndex++;
            funky.add(scan.nextLine());
        }

        int secNum = 0;
        double ques1 = 0;
        double ques2 = 0;

        Students stud = new Students (scan.nextLine(), secNum, ques1, ques2);

        while (scan.hasNext()) {
           secNum = Integer.parseInt(scan.nextLine());

            
        }



    }
}
