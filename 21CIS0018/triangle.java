public class triangle {
    public static void printTriangle(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }


        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        int input1 = 4;
        printTriangle(input1);
        System.out.println();
        printTriangle(input1 - 1);
    }

}
