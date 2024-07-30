package calculator;

import java.util.ArrayList;

//연산 수행 클래스
abstract class Calculator {

    abstract public Number calculate();
    abstract public void setList(Number result);
    abstract  public ArrayList<Number> getList();

}
