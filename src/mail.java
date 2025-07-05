import java.util.Scanner;
public class mail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your mail");
        String mail=sc.nextLine();
        if(mail.endsWith(".com")){
            System.out.println("its commercial");
        }
        else if(mail.endsWith(".org")){
            System.out.println("its organisational");
        }
        else if(mail.endsWith(".in")){
            System.out.println("its indian");
        }

    }
}
