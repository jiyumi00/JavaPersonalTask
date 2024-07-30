package calculator;

import java.util.Scanner;

public class ChangeInputType {
    public static Number getNumberFromInput(String input){

        try{
            if(input.contains(".")){
                return Double.parseDouble(input);
            }else{
                return Integer.parseInt(input);
            }
        }catch (NumberFormatException e){
            throw new IllegalStateException();
        }

    }
}
