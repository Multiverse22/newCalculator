package Calc;
import Operator.OperatorType;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Calculator {
    protected double numberA,numberB=0;
    protected double radius=0;
    static final double PI=3.14;
    protected double result;
    //static과 final을 둘다사용하면 객체없이도 어디서나 PI를 3.14 대신사용할 수 있으며
    //PI라는 값의 변경도 불가하므로 다른객체나 메서드에서도 편하게 사용 할 수 있다
    protected char basicOperator;
    protected ArrayList<Double> listArith;
    protected ArrayList<Double> listCircleArea;

    public Calculator(){
    }
    public void ifRIH(String answer){
        if (answer.equals("remove"))
           removeResult();
        if (answer.equals("inquiry"))
            inquiryResults();
        if (answer.equals("ishigh"))
            isHigh();
    }
    public static void printR(){
        System.out.println("삭제하고싶다면 remove 입력,조회하고싶으면 inquiry입력");
        System.out.println("현 입력값보다 높은값만을 보고싶으시면 ishigh입력");
    }
    public static void printExit(){
        System.out.println("더 계산하시고 싶으시면 아무거나 입력 (공백포함) (exit 입력시 종료 가능)");
    }
    public boolean emptyList(){
        //listArith는 protected로 작성되어 클래스.list.isEmpty()를 사용할 수 없다 그래서 메서드로 작성
        if(getList().isEmpty())
        {
            return true;
        }
        else
            return false;
    }
    protected void setNumberA(double numberA){
        this.numberA=numberA;
    }
    protected void setNumberB(double numberB){
        this.numberB=numberB;
    }
    protected void setBasicOperator(char basicOperator){
        this.basicOperator=basicOperator;
    }

    protected void setRadius(double radius){
        this.radius=radius;
    }
    protected double getNumA(){
        return numberA;
    }
    protected double getNumB(){
        return numberB;
    }
    protected char getOp(){
        return basicOperator;
    }
    protected double getRadius(){
        return radius;
    }

    protected ArrayList<Double> getList(){
        return listArith;
    }

    public void listAdd(double a){
        ArrayList<Double> list=getList();
        list.add(a);
    }
    public void removeResult(){
        ArrayList<Double> list=getList();
        list.remove(0);
        System.out.println("삭제완료");
    }
    public void inquiryResults(){
        ArrayList<Double> list=getList();

        System.out.println("------------현재 목록은 다음과 같습니다:-----------");
        for (double k : list){
            System.out.println(k);
        }
        System.out.println("------------현재 목록은 다음과 같습니다:-----------");
    }
    public void calculateCircleArea(double radius){
        setRadius(radius);
        double circleArea=PI*radius*radius;
        listAdd(circleArea);
        System.out.println("반지름이 "+radius+" 인 원의넓이는 " + circleArea + " 입니다");
    }
    public void calculate(double a,double b,char op)
    {
        setNumberA(a);
        setNumberB(b);
        setBasicOperator(op);
        switch (getOp()) {
            case '/':
                result = OperatorType.Op.DIV.apply(numberA,numberB);
                break;
            case '*':
                result = OperatorType.Op.MUL.apply(numberA,numberB);
                break;
            case '+':
                result = OperatorType.Op.ADD.apply(numberA,numberB);
                break;
            case '-':
                result = OperatorType.Op.SUB.apply(numberA,numberB);
                break;
            case '%':
                result = OperatorType.Op.Mod.apply(numberA,numberB);
                break;
            default:
                throw new ArithmeticException("잘못된 연산기호 입니다");
        }
        System.out.println(a+ " " +op+ " " +b+ " = " + result + "입니다");
        listAdd(result);
    }
    public void isHigh(){
        ArrayList<Double> list=getList();
        Stream<Double> stream=list.stream();
        double numA=getNumA();
        double numB=getNumB();
        /*
        구현하고싶은것 listA의 값들을 돌면서
        현재!!! numA와 numB값보다 높은 배열의 값들을
        listB에 넣고싶은것이다!!!!
        다시생각해보니 굳이 listB에 넣어야하나?
        그냥 실행한값들을 println만해도 상관없을것같다.

        public void aaa(T a,T b){

        for(double d:listA)
        {
            if(d>a.doubleValue()&&d>b.doubleValue())
                System.out.println(d);
        }
        }
        원래 구현하고자 했던 식
        */
        System.out.println("------------현재 입력받은 값(numberA:"+numA+",numberB:"+ numB +") 보다 높은값들은:-----------");
        stream.filter( e-> e>numA && e> numB)
                .forEach(System.out::println);
        //아주 쌈@뽕하게 구현이된 모습 e->(요소element로 인식) e>numberA.doubleValue() && e>numberB.doubleValue() 이부분은
        //listA에 있는 요소중 현재 값 numberA와 numberB보다 큰 요소만을 선택해 반복println문을 실행함
        System.out.println("------------현재 입력받은 값(numberA:"+numA+",numberB:"+ numB +") 보다 높은값들은:-----------");
    }
}

