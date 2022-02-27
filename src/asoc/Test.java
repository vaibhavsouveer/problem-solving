package asoc;

public class Test {
    static int t1 = 0, t2 = 1;
    public static void main(String[] args) {
        int n = 10;
        // 0, 1, 1, 2, 3, ..
        Test.printRec(n);

    }



    public static void printNFib(int n) {
        if(n == 1) {
            System.out.println("0 ");
        } else if (n == 2) {
            System.out.println("0 ");
            System.out.println("1 ");
        } else {
            System.out.println("0 ");
            System.out.println("1 ");
            int temp1 = 0, temp2 = 1;
            for(int i = 3; i <= n; i++) {
                int printNumber = temp1 + temp2;
                if(printNumber > 100) {
                    break;
                }
                System.out.println( printNumber + " ");
                temp1 = temp2;
                temp2 = printNumber;

            }
        }
    }

    private static void printRecursively(int n) {
        int temp = t1 + t2;
        if(n > 1 && temp < 100) {
            t1 = t2;
            t2 = temp;
            System.out.println(temp);
            printRecursively(n-1);
        }
    }

    private static void printRec(int upperLimit) {
        if(upperLimit == 1) {
            System.out.println(t1);
            System.out.println(t2);
        } else {
            printRec(upperLimit - 1);
            int printNumber = t1 + t2;
            t1 = t2;
            t2 = printNumber;
            if(printNumber < upperLimit) {
                System.out.println(printNumber);
            }
        }
    }
}
