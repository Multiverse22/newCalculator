import java.util.ArrayList;

public class Calculator {
    private int num1=0,num2=0;
    //직접 접근 금지
    private char basicOperator;
    ArrayList<Integer> list = new ArrayList<Integer>();
    //연산결과를 저장하는 컬렉션 타입 필드
    public Calculator(){

    }

    public void setA(int a){
        num1=a;
    }
    public void setB(int b){
        num2=b;
    }
    public void setOp(char op){
        basicOperator=op;
    }
    //Setter 클래스내부에서만 변경할 수 있게 num1,num2,basicOperator를 전부 private로 변경했지만 Setter 메서드를 사용하면
    //private로 변경하는 의미가 없다. 이부분은 나중에 변경할 예정
    public int getA(){
        return num1;
    }
    public int getB(){
        return num2;
    }
    public char getOp(){
        return basicOperator;
    }
    //Getter 하지만 이런 Getter/Setter는 사용하는것을 지양하는것이 좋다. 이유는 TIL에 작성

    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }
    public void opError(char op){
        System.out.println("잘못된 사칙연산기호 " + op + "를 입력하셨습니다 + - * / 기호중에서 다시 시도하십시오");
    }
    public int calculate()
    {
        //4칙연산을 수행하는 메서드를 불러와 계산하는 계산메서드Calculate()
        //List list=new List();
        int result = 0;
        switch (basicOperator) {
            case '/':
                result=div(num1,num2);
                System.out.println("결과값은" + result + "입니다");
                break;
            case '*':
                result = mul(num1,num2);
                System.out.println("결과값은" + result + "입니다");
                break;

            case '+':
                result = add(num1,num2);
                System.out.println("결과값은" + result + "입니다");
                break;
            case '-':
                result = sub(num1,num2);
                System.out.println("결과값은" + result + "입니다");
                break;
            default:
                System.out.println("잘못된 사칙연산기호 " + basicOperator + "를 입력하셨습니다 + - * / 기호중에서 다시 시도하십시오");
                break;
        }
        //리스트에 저장함
        list.add(result);
        return result;
    }
}

