public class arraystatistics {

    public void read(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("(" + arr[i] + ")");
            System.out.println(" ");
            sum = sum + arr[i];
        }
        System.out.println("sum" + sum);
    }

    public void MinMax(int[] arr) {
        int Max = arr[0];
        int Min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int c = arr[i];
            if (c >= Max) {
                Max = c;
            }
            if (c <= Min) {
                Min = c;
            }
        }
        System.err.println("max:" + Max + "min:" + Min);
    }

    public void EvenOdd(int[] arr) {
        int Even = 0;
        int Odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                Even++;
            } else {
                Odd++;
            }
        }
        System.out.println("Even: " + Even);
        System.out.println("Odd: " + Odd);
    }

    public void CAT(int[] arr) {
        int P = 0;
        int N = 0;
        int Z = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                P++;
            } else if (arr[i] < 0) {
                N++;
            } else {
                Z++;
            }
        }
        System.out.println("Positive: " + P);
        System.out.println("Negative: " + N);
        System.out.println("Zero: " + Z);
    }
}