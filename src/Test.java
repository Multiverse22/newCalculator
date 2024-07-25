import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator calculator = new ArithmeticCalculator();

        System.out.println("첫 번째 숫자를 입력하세요: ");
        //String buffer=sc.nextLine();
        System.out.println("두 번째 숫자를 입력하세요: ");
        //System.out.println(num1+","+num2);
        System.out.println("원하시는 사칙연산 기호를 입력하세요");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        char op = sc.next().charAt(0);


        calculator.calculate(num1, num2, op);
    }
}
