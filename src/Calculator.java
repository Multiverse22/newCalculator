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
    //값을 직접 수정하는 것이 아닌 Calculator 클래스 내부에 삭제 메서드를 구현
    //이제 Main메서드에서는 remove메서드를 호출해 가장 먼저들어온 값을 list에서 삭제할 수 있다.
    public void remove(){
        list.remove(0);
        System.out.println("삭제완료");
    }
    public void calculate()
    {
        //당장에는 int반환값을 반환할 일이 없으니 void형식으로 변경
        //4칙연산을 수행하는 메서드를 불러와 계산하는 계산메서드Calculate()
        //List list=new List();
        int result = 0;
        boolean flag = true;
        switch (basicOperator) {
            case '/':
                result = div(num1,num2);
                break;
            case '*':
                result = mul(num1,num2);
                break;
            case '+':
                result = add(num1,num2);
                break;
            case '-':
                result = sub(num1,num2);
                break;
            default:
                System.out.println("잘못된 사칙연산기호 " + basicOperator + "를 입력하셨습니다 + - * / 기호중에서 다시 시도하십시오");
                flag=false;
                break;
        }
        if(flag==true)
            System.out.println("결과값은" + result + "입니다");
        //리스트에 저장함
        list.add(result);
        //return result;
    }
}

