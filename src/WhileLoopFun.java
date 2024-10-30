public class WhileLoopFun {

    public WhileLoopFun() { }

    public void printDigits(int number) {
        int num = 0;
        String number2 = Integer.toString(number);
        while (num < number2.length()) {
            System.out.println(number2.charAt(num));
            num ++;
        }
    }

    public int countLetter(String word, String letter) {
        int num = 0;
        int xAmount = 0;
        while (num < word.length()) {
            if (word.substring(num, num + 1).equals(letter)){
                xAmount ++;
            }
            num ++;
        }
        return xAmount;
    }

    public int maxDoubles(int number, int threshold) {
        int num = number;
        int xAmount = 0;
        while (num <= threshold) {
            num *= 2;
            xAmount ++;
        }
        if (xAmount == 0) {
            return xAmount;
        }
        return xAmount - 1;
    }

    public boolean isPrime(int number) {
        int num = 2;

        if (number == 1){
            return false;
        }
        while (num < (number - 1)) {
            if ((number % num) == 0){
                return false;
            }else {
                num ++;
            }
        }
        return true;
    }
}
