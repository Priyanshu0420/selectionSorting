import java.util.Scanner;
public class currencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the Amount: ");
        Float value=sc.nextFloat();
        System.out.println("press 1: INDIAN TO USD ");
        System.out.println("press 2: INDIAN TO WON ");
        int choice =sc.nextInt();
        switch(choice){
            case 1:
                Float value_USD=0.0117f*value;
                System.out.print("value is: "+value_USD);
                break;
            case 2:
                Float value_WON=value*15.8f;
                System.out.print("value is: "+value_WON);
                break;
            default:
                System.out.println("invalid choice");
        }

    }
}
