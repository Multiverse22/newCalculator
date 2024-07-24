import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        int count=0;
        int result=0;
        while (true)
        {

            System.out.println("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            //String buffer=sc.nextLine();
            System.out.println("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            //System.out.println(num1+","+num2);
            System.out.println("원하시는 사칙연산 기호를 입력하세요");
            char basicOperator = sc.next().charAt(0);
            System.out.println(basicOperator);

            //System.out.println(basicOperator);
            switch (basicOperator)
            {
                case '/':
                    if (num2 == 0)
                    //어떤수를 0으로 나눌수는 없음
                    {
                        System.out.println("나눗셈 연산에서 분모에 0이 들어갈 수 없습니다 error:1");
                        break;
                    }
                    result = num1 / num2;
                    System.out.println("결과값은" + result + "입니다");
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("결과값은" + result + "입니다");
                    break;

                case '+':
                    result = num1 + num2;
                    System.out.println("결과값은" + result + "입니다");
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("결과값은" + result + "입니다");
                    break;
                default:
                    System.out.println("잘못된 사칙연산기호 " + basicOperator + "를 입력하셨습니다 + - * / 기호중에서 다시 시도하십시오");
                    break;



            }
            list.add(result);
            /*if(count==10)
            {
                for(int i=0;i<9;i++)
                {
                    intArray[i]=intArray[i+1];
                }
                intArray[9]=result;
            }
            else
            {
                intArray[count]=result;
                count++;
            }*/
            String answer=sc.nextLine();
            System.out.println("삭제하고싶다면 remove 입력");
            answer=sc.nextLine();
            if(answer.equals("remove")) {
                list.remove(0);
            }
            System.out.println("더 계산하시겠습니까? (exit 입력시 종료 가능)");
            answer = sc.nextLine();
            if(answer.equals("exit")) {
                for (int i = 0; i < list.size(); i++) {

                    System.out.println("intArray[" + i + "]=" + list.get(i));
                }
                break;
            }
        }
    }
}
