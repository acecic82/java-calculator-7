package calculator;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Calculator calculator = new Calculator();

        System.out.println("덧셈할 문자열을 입력해 주세요.");
        int result = calculator.putTargetAndCalculate();
        System.out.println("결과 : " + result);

    }
}
