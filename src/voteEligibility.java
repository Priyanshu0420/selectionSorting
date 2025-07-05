import java.util.Scanner;
public class voteEligibility {
    public static void eligibility(int age){
        if(age>=18){
            System.out.println("youre are eligible");
        } else{
            System.out.println("you arent eligible to vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int age=sc.nextInt();
        eligibility(age);
    }
}
