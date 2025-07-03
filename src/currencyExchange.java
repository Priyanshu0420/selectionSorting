import java.util.Scanner;
public class currencyExchange {
    public static float convert(int choice,Float value){
        Scanner sc=new Scanner(System.in);
       // choice=sc.nextInt();
        switch(choice){
            case 1:
                //exchange the value to?
                System.out.println("indian to USD");
                return value*0.0119f;
                //break;
            case 2:
                System.out.println("indian to WON");
                return value*15.88f;
              //  break;
            case 3:
                System.out.println("indian to EURO");
                return value*0.011f;
              //  break;
            default:
                System.out.println("inavlid choice");
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
 /*       System.out.println("1:indian to usd");
        System.out.println("2:indian to won");
        System.out.println("3:indian to euro");
        System.out.println("enter your choice");               */
       // int choice =sc.nextInt();
        System.out.println("enter the value to be exchanged");
        float value=sc.nextFloat();
        if(value>0) {
            System.out.println("1:indian to usd");
            System.out.println("2:indian to won");
            System.out.println("3:indian to euro");
            System.out.println("enter your choice");
            int choice = sc.nextInt();
            float exchangedValue = convert(choice, value);
            System.out.println(exchangedValue);
   /*     if(exchangedValue>0){
            switch (choice){
                case 1:
                    System.out.println(exchangedValue);
                    break;
                case 2:
                    System.out.println(exchangedValue);
                    break;
                case 3:
                    System.out.println(exchangedValue);
                    break;
                default:
                    System.out.println("technical error");
            }
        }               */
        } else{
            System.out.println("try again & input a valid value");
        }
    }

}
