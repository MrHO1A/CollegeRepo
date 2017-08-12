//Cheating Problem Codevita 
//URL to Question -> https://drive.google.com/file/d/0B7iOo6VhXBx4bXBRdlpuS2cwalk/view
//Author -> Aman Vishwakarma (http://fb.com/aman.vishwakarma.xyz)

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
public class Cheating_Problem {
    public String Decode(String Message, int row){
        String Decoded = "";//Contains String To Return
        int index = 0;// Index of Character In Encrypted String
        String[][] fence = new String[row][Message.length()];//Creating 2D Array Of Length
        //Filling Everything With X
        for(int i=0;i<row;i++){
            for(int j = 0;j<Message.length();j++){
                fence[i][j]= "X";
            }
        }
        //Adding Position Where we can add characters in 2D Array
        boolean can_go_down = false;
        int rows=0,col=0;
        for(int i=0;i<Message.length();i++){
                if(rows == 0){
                    can_go_down=true;
                }
                if(rows == row-1){
                    can_go_down = false;
                }
                fence[rows][col++]="*";//* is going to define where we can add characters
                if (can_go_down) {
                    rows++;
                    
                }
                else{
                    rows--;
                }
            }
        //Adding Characters to those specific points
        int index_of_word = 0;
        for(int i = 0;i<row;i++){
            for(int j = 0;j<Message.length();j++){
                if(fence[i][j].equals("*")&& index_of_word<Message.length()){
                    fence[i][j] = Character.toString(Message.charAt(index++));
                }
            }
        }
        //Reading 2D In Pattern to get Decoded String
        int row_number = 0,col_number = 0;
        for(int i = 0;i<Message.length();i++){
            if(row_number==0){
                can_go_down = true;
            }
            if(row_number == row-1){
                can_go_down = false;
            }
            //This Will Remove All Padding Characters and Also Character X in Decoded Sentence
            if(!"X".equals(fence[row_number][col_number])&&col_number<Message.length()){
                Decoded = Decoded+fence[row_number][col_number++];
            }
            if(can_go_down){
                row_number++;
            }
            else{
                row_number--;
            }
        }
       
        return Decoded;//Returning Decoded String
    }
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter depth -> ");
        int Depth = Sc.nextInt();
        if(Depth>10){
            System.exit(0);
        }
        System.out.println("Enter Encrypted Text -> ");
        String Message = Sc.next();
        Cheating_Problem cp = new Cheating_Problem();
        String text = cp.Decode(Message, Depth);
        System.out.println(text);
    }
}
