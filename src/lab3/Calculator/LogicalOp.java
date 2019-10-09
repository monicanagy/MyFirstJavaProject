package lab3.Calculator;

public class LogicalOp {


    public String verifyText(String text) {
        if (text.equals("FastTrack"))
            return ("Learning text comparison");
        else
            return ("Got to try some more");

    }

    public int verifyNumber(int number) {
        if (number >= 2 && number <=8)
            return (number);

        else
            return (0);

    }
}

