import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        Calculator calculator=new Calculator();
        //테스트를 위해 3번만
        for(int i=0;i<3;i++)
        {

            System.out.println("첫 번째 숫자를 입력하세요: ");
            //String buffer=sc.nextLine();
            System.out.println("두 번째 숫자를 입력하세요: ");
            //System.out.println(num1+","+num2);
            System.out.println("원하시는 사칙연산 기호를 입력하세요");

            calculator.num1=sc.nextInt();
            calculator.num2=sc.nextInt();
            calculator.basicOperator=sc.next().charAt(0);
            calculator.Calculate();

            //list.add(calculator.Calculate());

            System.out.println("삭제하고싶다면 remove 입력,조회하고싶으면 inquiry입력");
            String answer =sc.nextLine();
            //이 부분 항상 주의할 것
            answer = sc.nextLine();
            if (answer.equals("remove")) {
                calculator.list.remove(0);
                System.out.println("삭제완료");
            }
            if(answer.equals("inquiry")) {
                System.out.println("------------현재 목록은 다음과 같습니다:-----------");
                for(int k:calculator.list)
                {

                    System.out.println(k);
                }
                System.out.println("------------현재 목록은 다음과 같습니다:-----------");
            }
            System.out.println("더 계산하시겠습니까? (exit 입력시 종료 가능)");
            answer = sc.nextLine();
            if (answer.equals("exit")) {
                System.out.println("계산 종료");
                break;

            }

            //System.out.println(basicOperator);

        }
    }
}
