public class IT24100693Lab7Q2B {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.print(i + " - ");
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        } while (i <= 5);
    }
}
