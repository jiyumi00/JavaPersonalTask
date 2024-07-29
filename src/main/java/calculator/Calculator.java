package calculator;

import java.util.ArrayList;

//연산 수행 클래스
abstract class Calculator {
    abstract public double calculate();
    abstract public void setList(double result);
    abstract  public ArrayList<Double> getList();

}
