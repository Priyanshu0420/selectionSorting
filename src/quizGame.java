import java.util.Scanner;
public class quizGame {
    static int Score = 0;
    static Scanner sc = new Scanner(System.in);
    static void greet(){
        System.out.print("Enter your name: ");
        String name=sc.nextLine();
        System.out.println("hello "+name+" ready for the game? \n         let's Start!");
    }
    static void MCQ(){
        String [] Question ={"1.) What is the size of an int in Java?",
                "2.) Which method is the entry point of a Java program?",
                "3.) Which collection class does not allow duplicate elements?"};
        String [][] MCQOption={{"A. 2 bytes \n B. 4 bytes \n C. 8 bytes \n D. Depends on the system"},
                               {"A. start()\n" +
                                       "B. main()\n" +
                                       "C. run()\n" +
                                       "D. execute()"},
                               {"Which collection class does not allow duplicate elements?\n" +
                                       "A. List\n" +
                                       "B. ArrayList\n" +
                                       "C. HashSet\n" +
                                       "D. LinkedList"}};
        String []MCQAnswers={"B","B","C"};
        for(int i=0;i<Question.length;i++){
            System.out.println(Question[i]);
            for(int j=0;j< MCQOption[i].length;j++){
                System.out.println(MCQOption[i][j]);
            }
            System.out.print("Your Answer: ");
            String yourAnswer=sc.nextLine().toUpperCase();
            if(yourAnswer.equals(MCQAnswers[i])){
                System.out.println("wohooooo!! you got that right");
                Score++;
            }else{
                System.out.println("Oops!! you got that wrong");
            }
            System.out.println();
        }
    }
    //--------------------->END OF MCQ
    static void fillInTheBlanks(){
        String [] Question={"The keyword used to inherit a class in Java is:","The default value of a boolean variable in Java is:","The loop that always executes at least once is:"};
        String [] QuestionAnswer={"extends","false","dowhile","do-while"};
        for(int i=0;i<Question.length;i++){
            System.out.println(Question[i]);
            System.out.print("Your Answer: ");
            String answer=sc.nextLine().toLowerCase();
            if(answer.equals(QuestionAnswer[i]) || answer.equals("do-while")) {
                System.out.println("wohooo!! you got that right");
                Score++;
            }else{
                System.out.println("Oops!! you got that wrong");
            }
            System.out.println();
        }
    }
    //-------------------------> FILL IN THE BLANKS
    static void trueFalse(){
        String [] Question={"Java is a compiled and interpreted language","Java supports multiple inheritance using classes","Java allows operator overloading"};
        String [] answers={"TRUE","FALSE","FALSE"};
        for(int i=0;i<Question.length;i++){
            System.out.println(Question[i]);
            System.out.print("Your Answer: ");
            String answer=sc.nextLine().toUpperCase();
            if(answer.equals(answers[i])){
                System.out.println("Wohooo!!! you got that right");
                Score++;
            }else{
                System.out.println("Oops!! you got that Wrong");
            }
        }
        System.out.println();
    }
    //---------------------------->END OF TRUE & FALSE

    public static void main(String[] args) {
        greet();
        String playAgain;
       do{ System.out.println("Select your niche");
        System.out.println("1---> Multiple choice question");
        System.out.println("2---> Fill in the blanks");
        System.out.println("3---> True/False");
        int choice =sc.nextInt();
        sc.nextLine();
        switch(choice){
            case 1:
                MCQ();
                System.out.println();
                break;
            case 2:
                fillInTheBlanks();
                System.out.println();
                break;
            case 3:
                trueFalse();
                System.out.println();
                break;
            default:
                System.out.println("Enter a Valid Input");
        }
        System.out.println("Your Score is: "+ Score );
           System.out.print("Do you want to play again? (yes/no): ");
           playAgain = sc.nextLine().toLowerCase();
       } while (playAgain.equals("yes"));

        System.out.println("Thanks for playing! Goodbye :)");
    }
}
