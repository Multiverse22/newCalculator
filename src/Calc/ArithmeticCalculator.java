package Calc;
import Operator.OperatorType;

import java.util.ArrayList;

public class ArithmeticCalculator<T extends Number> extends Calculator {
    protected T numA;
    protected T numB;
    protected double result;
    OperatorType<T> operatorType;
    protected ArrayList<Double> listA;
    protected ArrayList<Double> listB;
    //새 리스트를 선언했다면 꼭 선언과 동시에 초기화를 하던 생성자에서 초기화를 해줘야한다.
    public ArithmeticCalculator(){
        listA=new ArrayList<Double>();
        listB=new ArrayList<Double>();
    }
    public void setA(T a){
        numA=a;
    }
    public void setB(T b){
        numB=b;
    }
    public void setResult(double result){
        this.result=result;
    }
    public double getResult(){
        return result;
    }
    public T getNumA(){
        return numA;
    }
    public T getNumB(){
        return numB;
    }
    //@Override를 적지않아도 된다 매개변수가 바뀐것이라 오버로딩으로 적용되기때문
    public void listAdd(double a){
        listA.add(a);
    }
    @Override
    public void removeResult(){
        listA.remove(0);
        System.out.println("삭제완료");
    }
    @Override
    public boolean emptyList(){
        if(listA.isEmpty())
        //변수설정에 주의
        {
            return true;
        }
        else
            return false;
    }
    public void inquiryResults(){
        System.out.println("------------현재 목록은 다음과 같습니다:-----------");
        for (Double k : listA) {
            System.out.println(k);
        }
        System.out.println("------------현재 목록은 다음과 같습니다:-----------");
    }
    public void inquiryListB(){
        System.out.println("------------현재 목록은 다음과 같습니다:-----------");
        for (Double k : listB) {
            System.out.println(k);
        }
        System.out.println("------------현재 목록은 다음과 같습니다:-----------");
    }
    public void calculate(T a,T b,char op)
    {
        setA(a);
        setB(b);
        setOp(op);
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
        //리스트에 저장함
        //사칙연산 기호중 아무것도 해당되지않는 result는 0이되는데 이경우에만 리스트에 넣지말자
        //그냥 result가 0일때 리스트에 추가하지않으면 사칙연산후 결과값이 0일때도 리스트에 넣지않기때문에 이런식으로 구현
        listAdd(result);
        Temp();
    }
    public void Temp(){
        T tmpA=getNumA();
        T tmpB=getNumB();
        double resultT=getResult();
        if(resultT>tmpA.doubleValue()&&resultT>tmpB.doubleValue())
        {
            listB.add(resultT);
        }
        //입력값들보다 높은수는 listB에 add하는 메서드 구현
    }
}
