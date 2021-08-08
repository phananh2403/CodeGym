package AutomatedTesting.FizzBuzz;

public class FizzBuzzTranslate {
    private int number = 1;
    private String result = "";

    public FizzBuzzTranslate() {
    }

    public FizzBuzzTranslate(int number, String result) {
        this.number = number;
        this.result = result;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void traslate() {
        boolean isDivisibleBy3 = this.getNumber() % 3 == 0;
        boolean isDivisibleBy5 = this.getNumber() % 5 == 0;
        boolean isInvalid = this.number < 100 && this.number > 0;

        if (!isInvalid)
            this.setResult("");
        else if (isDivisibleBy3 && isDivisibleBy5)
            this.setResult("FizzBuzz");
        else if (isDivisibleBy3)
            this.setResult("Fizz");
        else if (isDivisibleBy5)
            this.setResult("Buzz");
        else {
            int firstDigit = (int) (this.getNumber() / 10);
            int secondDigit = (int) (this.getNumber() % 10);

            String[] readNumber = {"không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín", "mười"};

            if (firstDigit > 0)
                this.setResult(readNumber[firstDigit] + " " + readNumber[secondDigit]);
            else
                this.setResult(readNumber[secondDigit]);
        }
    }
}
