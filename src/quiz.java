import java.util.*;
public class quiz {
    public static void multipleCQ(char input1){
        //question one:
        char correct_answer='B';
/*                "System.out.println(x++);");
        System.out.println("A:6");
        System.out.println("B:5");
        System.out.println("C:Error");
        System.out.println("D:Undefined");
        System.out.print("Enter your answer(A/B/C/D): ");                    */
        if(input1==correct_answer){
            System.out.println("hurray!! you got that right");
        } else{
            System.out.println("Oops!! that's the wrong answer");
        }
    }
    public static void fillTheBlanks(String input2){
        //question two:
        String answer = "def";
    //    System.out.print("In python,a function is defined using the keyword");
        if(input2.equals(answer)){
            System.out.println("hurray!! you got that right");
        } else{
            System.out.println("Oops!! that's the wrong answer");
        }
    }
    public static void trueFalse(char input3){
        //question three:
        char result='F';
      //  System.out.println("In Java, the String class is mutable?");
        if(input3==result){
            System.out.println("hurray!! you got that right");
        } else{
            System.out.println("Oops!! that's the wrong answer");
        }
       // value=Character.toUpperCase(sc.next.charAt(0));
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
      //  char value=Character.toUpperCase(sc.next().charAt(0));
        System.out.println("<========================================================WELCOME==============================================>");
     //   String output=sc.nextLine().toLowerCase();
        System.out.println("1: Multiple Choice Question");
        System.out.println("2: Fill in the Blanks");
        System.out.println("3: True/False");
        System.out.print("Enter your choice (1/2/3): ");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                //multiple choice question
                System.out.println("=====================int x=5 \n System.out.println(x++);===========================================");
                System.out.println("A:6");
                System.out.println("B:5");
                System.out.println("C:Error");
                System.out.println("D:Undefined");
                System.out.println("Enter your answer(A/B/C/D): ");
                System.out.print("player 1 input: ");
                char value=Character.toUpperCase(sc.next().charAt(0));
                System.out.print("player 2 input: ");
                char print=Character.toUpperCase(sc.next().charAt(0));
                multipleCQ(value);
                multipleCQ(print);
                break;
            case 2:
                //Fill in the Blanks
                System.out.println("In python,a function is defined using the keyword");
                System.out.print("Enter your answer: ");
                String output=sc.next().toLowerCase();
                fillTheBlanks(output);
                break;
            case 3:
                //True/False
                System.out.println("In Java, the String class is mutable?");
                System.out.print("True/False: ");
                char answer=Character.toUpperCase(sc.next().charAt(0));
                trueFalse(answer);
                break;
            default:
                System.out.println("Enter a Valid Input");
        }
    }
}
