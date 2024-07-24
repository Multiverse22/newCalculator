
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int result;
        System.out.println("첫 번째 숫자를 입력하세요: ");
        int num1=sc.nextInt();
        //String buffer=sc.nextLine();
        System.out.println("두 번째 숫자를 입력하세요: ");
        int num2=sc.nextInt();
        System.out.println(num1+","+num2);
        System.out.println("원하시는 사칙연산 기호를 입력하세요");
        char basicOperator=sc.next().charAt(0);
        System.out.println(basicOperator);
     }

}

