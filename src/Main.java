public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int n = 0; n < 20; n++) {
            System.out.printf("Fibonacci(%d) = %d\n", n+1, getFibonacci(n+1));
        }

        getCollatzConjecture(20);

    }

    public static int getFibonacci(int n) {
        int i;
        if (n < 0) {
            i=0;
        }
        else if (n < 2) {
            i= n;
        }
        else {
            i = getFibonacci(n - 1) + getFibonacci(n - 2);

        }
        //System.out.printf("getFibonacci(%d) = %d\n", n, i);
        return i;
    }

    public static void getCollatzConjecture(int n) {
        if (n < 1) return;

        int ret;

        if (n%2==0) {
            System.out.printf("n = %d, n is even, n/2 = %d\n", n, ret = n/2);

        }
        else {
            System.out.printf("n = %d, n is odd, (nx3)+1 = %d\n", n, ret = (n*3)+1);
        }

        if (ret > 1)
            getCollatzConjecture(ret);
        else
            System.out.println("n = 1, stop!");


    }
}
