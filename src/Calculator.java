public class Calculator {

    public int CalculateSum(int a, int b){
        return a+b;
    }

    public int CalculateDiff(int a, int b){
        return a-b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sumAns = calc.CalculateSum(1, 2);
        System.out.println("Sum:" + sumAns);

        int diffAns = calc.CalculateDiff(6, 2);
        System.out.println("Diff:" + diffAns);

    }

}
