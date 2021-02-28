import static java.lang.System.exit;

public class QuizZero {

    public static void main(String[] args) {
        QuizZero qz = new QuizZero();

        int score = qz.test();
        exit(score);
    }

    public int test() {
        int runningTotal;
        return 15 - 15;
    }


    // return zero
    public static  int Qzero(int a, int b) {
        return 0;
    }

    // return the sum of a and b
    public static  int Qone(int a, int b) {
        int sum = a + b;
        return sum;
    }

    //return the product
    public static  int Qtwo(int a, int b) {
        int product = a * b;
        return product;
    }

    //return the difference of a and b
    public static  int Qthree(int a, int b) {
        int difference = a - b;
        return difference;
    }

    //return the negation of a
    public static  int Qfour(int a) {
        int negation = a * -1;
        return negation;
    }


    // write code to pass the test
    public static  int Qfive(int a, int b) {
        int Qfive = (a*2) + (b*0);
        return Qfive;
    }

    // write code to pass the test
    public static  int Qsix(int a) {
        int raisedToThird = (int) Math.pow(a, 3);
        return raisedToThird;
    }

    // write code to pass the test
    public static  int Qseven(int a, int b) {
        int noClue = 0;
        if (b < 10) {
            noClue = a - (b *2);
        } else {
            noClue = 3;
        }
        return noClue; }

    //return the sum of a and b divided by c
    public static  int Qeight(int a, int b, int c) {
        int addDivide = (a + b) / c;
        return addDivide;
    }

    // write code to pass the test
    public static  int Qnine(int a, int b) {
        int doubleAddFive = a * b + 5;
        return doubleAddFive;
    }

    // write code to pass the test
    public static  boolean Qaay(boolean a, boolean b) {
        boolean conjunction = a && b;
        return conjunction; }

    // write code to pass the test
    public static  boolean Qbee(boolean a, boolean b) {
        boolean disjunction = a || b;
        return disjunction;
    }

    // write code to pass the test
    public static  int Qcee(boolean a, boolean b) {
        int seemsLogical = 0;
        if (a == b) {
            seemsLogical = -2;
        }
        else {
            return 1;
        }
        return seemsLogical;
    }

    //return x divided by b squared
    public static float Qdee(float x, int b) {
        double divideAndSquare = x / Math.pow(b,2);
        return (float)divideAndSquare;
    }

    // if x-y is less than 1/10,000 return zero otherwise return 1
    public static int Qeee(double x, double y) {
        int returnValue = 1;
        if (Math.abs(x - y ) < 0.0001) {
            returnValue = 0;
        }
        return returnValue;
    }

    //if a is zero return zero, if a is even return a random number times zero, if not even return 5 - 5
    public static  int Qeff(int a) {
        int gibberish = 0;
        if (a == 0) {
            gibberish = 0;
        }
        else if (a % 2 == 0) {
            gibberish =  (int)Math.random() * 0;
        }
        if (a % 2 == 1) {
            gibberish =  5 - 5;
        }
    return gibberish;
    }

}
