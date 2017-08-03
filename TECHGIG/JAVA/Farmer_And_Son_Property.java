/*
 * Tech Gig Farmer Property And Sons Question
 * Week long challange
 */
package techgig;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author AMAN
 */
public class Farmer_And_Son_Property {
 public static String farms_division(int[] input1)
    {
        String ret = null;
        int Total_area_of_farm = 0;
        int errors = 0;
           for(int current_area:input1){
               if(current_area < 0){
                   errors = 1;
               }
               else{Total_area_of_farm = Total_area_of_farm+current_area;}}
           if(errors == 1){ret = "invalid";}
           else{
               if(Total_area_of_farm%2 == 0){
                   ret = "yes";}
               else{ret="no";}}
           return ret;
    }
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String output;
        int ip1_size = 0;
        ip1_size = Integer.parseInt(in.nextLine().trim());
        int[] ip1 = new int[ip1_size];
        int ip1_item;
        for(int ip1_i = 0; ip1_i < ip1_size; ip1_i++) {
            try{
            ip1_item = Integer.parseInt(in.nextLine().trim());
            ip1[ip1_i] = ip1_item;
            }
            catch(Exception e){
                System.out.println("invalid");
                System.exit(0);
            }
        }
        output = farms_division(ip1);
        System.out.println(String.valueOf(output));
    }
    
}
