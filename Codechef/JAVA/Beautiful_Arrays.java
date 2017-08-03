/*
*Codechef Beautiful Array Question
* https://www.codechef.com/problems/ICPC16B
*/

package codechef;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.print.DocFlavor;
import java.lang.*;
public class Beautiful_Arrays {
public ArrayList<Integer> Seperator(String s){
        ArrayList<Integer> numbers = new ArrayList();
        String[] temp_array = s.split("\\s");
        for(String num : temp_array){
            numbers.add(Integer.parseInt(num));
        }
        return numbers;
    }
public Boolean Check(ArrayList<Integer> deflated_array){
        boolean cs = false; 
        boolean return_val=false;
        ArrayList<Integer> Array_1 = (ArrayList<Integer>)deflated_array.clone();
        ArrayList<Integer> Array_2 = (ArrayList<Integer>)deflated_array.clone();
            for(int num_1 : Array_1 ){
                for(int num_2 : Array_2 ){
                    if(deflated_array.contains(num_1*num_2)==true){
                        cs = true;
                        return_val=true;
                        break;    
                    }   
                }
                if(cs==true){
                        break;
                    }
            }
            if(return_val==true){
                return return_val;
            }
            else{
                return return_val;
            }
    }
    public static void main(String[] args)throws IOException {
        Beautiful_Arrays cf = new Beautiful_Arrays();
        ArrayList<String> Inputs = new ArrayList();
        ArrayList<Integer> Input_Per = new ArrayList();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Number Of Itration");
        int Input_Quantity = Integer.parseInt(br.readLine());
        for(int i=1;i<=Input_Quantity;i++){
            System.out.println("Enter Number Of Elements In Array");
            Input_Per.add(Integer.parseInt(br.readLine()));
            System.out.println("Enter Elements Seperated By Spaces");
            Inputs.add(br.readLine());
        }
        for(String str : Inputs){ 
            ArrayList<Integer> deflated_array = cf.Seperator(str);
            boolean ret = cf.Check(deflated_array);
            System.out.println(ret);
        }  
    } 
}
