package calculator;

import java.util.ArrayList;

public class CircleCalculator extends Calculator{

    private int radius;
    private  ArrayList<Double> list=new ArrayList<>();

    public void setInput(int radius){
        this.radius=radius;
    }

    @Override
    public double calculate(){
        final double PI=3.14; // final, 정적변수 더이상 수정이 불가능하기 때문에 사용
        return PI*radius*radius;
    }


    public void setList(double result) {
        list.add(result);
    }

    public ArrayList<Double> getList(){
        return list;
    }



}
