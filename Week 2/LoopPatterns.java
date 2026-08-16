public class LoopPatterns {
    static void pattern(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(j);
            }
            System.out.println();
        }
        System.out.println();
        
        int c=N;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.println("*");
            }
            c=c-1;
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.println(i);
            }
            System.out.println();
        }
        System.out.println();
    }
}
