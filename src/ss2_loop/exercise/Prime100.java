package ss2_loop.exercise;


public class Prime100 {
    public static void main(String[] args) {
        int prefixNumber = 0;
        int check = 2;
        while (check < 100) {
            int count = 0;
            for (int i = 2; i <= check; i++) {
                if (check % i == 0) {
                    count++;
                }
            }
            if (count == 1) {
                prefixNumber++;
                System.out.println(check);
            }
            check++;
        }
    }
}
