import java.util.*;
public class positiveNegativeZero {
    public static void finder(){
        Scanner sc = new Scanner(System.in);
        int positive=0;
        int negative=0;
        int zero=0;
        int choice;
        do {
            System.out.println("enter the value");
            int value = sc.nextInt();
            if (value > 0) {
                positive++;
            } else if (value < 0) {
                negative++;
            } else {
                zero++;
            }
            System.out.println("wanna add more value? y/n");
            choice = sc.next().charAt(0);
        }
        while (choice == 'y' || choice == 'Y');
        System.out.println("positive:"+positive);
        System.out.println("neagtive:"+negative);
        System.out.println("zero:"+zero);
    }

    public static void main(String[] args) {
        finder();
    }
}
