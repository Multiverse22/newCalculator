package Operator;

public class DivideOperator {
    public DivideOperator() {

    }
    public int divideOperate(int a, int b) {
        if(b==0)
        {
            throw new ArithmeticException("0으로 나눌수는 없습니다");
        }
        return a / b;
    }
}
