public class FizzBuzz {
    public static String fizzBuzzClassify(int num) {
//        throw new UnsupportedOperationException();
        boolean isDivisibleBy3 = num % 3 == 0;
        boolean isDivisibleBy5 = num % 5 == 0;

        if (isDivisibleBy3 & isDivisibleBy5)
            return "FizzBuzz";
        else if (isDivisibleBy3)
            return "Fizz";
        else if (isDivisibleBy5)
            return "Buzz";
        else {
            String number = Integer.toString(num);
            if (hasNumber3(number))
                return "Fizz";
            else if (hasNumber5(number))
                return "Buzz";
            return "" + num;
        }
    }

    private static boolean hasNumber3(String num) {
        return num.contains("3");
    }

    private static boolean hasNumber5(String num) {
        return num.contains("5");
    }
}
