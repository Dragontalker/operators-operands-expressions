package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("previousResult = " + previousResult);

        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; // 2 * 10  = 20
        System.out.println("2 * 10 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result % 3; // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);
        System.out.println("previousResult = " + previousResult);

        // result = result + 1;
        result++; // 1 + 1 + 2
        System.out.println("1 + 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        // result = result - 1;
        result--;
        System.out.println("2 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);
    }
}
