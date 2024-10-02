public class IT24100693Lab7Q2C {
    public static void main(String[] args) {
        int number = 5;

        while (number > 0) {
            int count = number;
            while (count > 0) {
                System.out.print(number);
                count--;
            }
            System.out.println();
            number--;
        }
    }
}
