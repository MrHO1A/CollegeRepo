//Jhonny And The Wrapper Question Codevita 2017 July
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Jhonny_And_Wrapper {
    
    public String calculate(String[] input){
        double number_of_pep = Double.parseDouble(input[0]);
        double number_of_wrap = Double.parseDouble(input[1]);
        int number_of_days = 0;
        if(number_of_pep>=Math.pow(10, 8) && number_of_wrap >= Math.pow(10,8) ){
            return "Invalid Data";
        }
        else{
            for(int i = 1;i<=number_of_pep;i++){
                number_of_wrap++;
                if(number_of_wrap>=7){
                    number_of_pep = number_of_pep+1;
                    number_of_wrap = 0;
                }
                number_of_days = number_of_days+1;
            }
            
        }
        return Integer.toString(number_of_days);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num_test;
        String[] inputs;
        num_test = Integer.parseInt(br.readLine());
        String input = br.readLine();
        inputs = input.split("\\s");
        Jhonny_And_Wrapper e = new Jhonny_And_Wrapper();
        System.out.println(e.calculate(inputs));
    }
}