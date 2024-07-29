package Calc;
import Operator.OperatorType;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ArithmeticCalculator<T extends Number> extends Calculator {
    protected T numA;
    protected T numB;
    protected double result;
    protected ArrayList<Double> listA;

    //새 리스트를 선언했다면 꼭 선언과 동시에 초기화를 하던 생성자에서 초기화를 해줘야한다.
    public ArithmeticCalculator(){
        listA=new ArrayList<Double>();
    }
    @Override
    public ArrayList<Double> getList(){
        return listA;
    }
    protected void setA(T a){
        numA=a;
    }
    protected void setB(T b){
        numB=b;
    }

    protected T getNumberA(){
        return numA;
    }

    protected T getNumberB(){
        return numB;
    }
    //@Override를 적지않아도 된다 매개변수가 바뀐것이라 오버로딩으로 적용되기때문
    public void calculate(T a,T b,char op)
    {
        ArrayList<Double> list=getList();
        setA(a);
        setB(b);
        setBasicOperator(op);
        //당장에는 int반환값을 반환할 일이 없으니 void형식으로 변경
        //4칙연산을 수행하는 메서드를 불러와 계산하는 계산메서드Calculate()
        //List list=new List();
        switch (basicOperator) {
            case '/':
                result = OperatorType.Op.DIV.apply(numA,numB);
                break;
            case '*':
                result = OperatorType.Op.MUL.apply(numA,numB);
                break;
            case '+':
                result = OperatorType.Op.ADD.apply(numA,numB);
                break;
            case '-':
                result = OperatorType.Op.SUB.apply(numA,numB);
                break;
            case '%':
                result = OperatorType.Op.Mod.apply(numA,numB);
                break;
            default:
                throw new ArithmeticException("잘못된 연산기호 입니다");
        }
        System.out.println("결과값은" + result + "입니다");
        listAdd(result);
    }
    @Override
    public void Temp(){
        ArrayList<Double> list=getList();
        Stream<Double> stream=list.stream();
        T numberA=getNumberA();
        T numberB=getNumberB();
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
        System.out.println("------------현재 입력받은 값(numberA:"+numberA+",numberB:"+numberB+") 보다 높은값들은:-----------");
        stream.filter( e-> e>numberA.doubleValue() && e>numberB.doubleValue())
                .forEach(System.out::println);
        //아주 쌈@뽕하게 구현이된 모습 e->(요소element로 인식) e>numberA.doubleValue() && e>numberB.doubleValue() 이부분은
        //listA에 있는 요소중 현재 값 numberA와 numberB보다 큰 요소만을 선택해 반복println문을 실행함
        System.out.println("------------현재 입력받은 값(numberA:"+numberA+",numberB:"+numberB+") 보다 높은값들은:-----------");
    }
}
