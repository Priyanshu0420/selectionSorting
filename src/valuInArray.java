import java.util.Scanner;
public class valuInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many array you want to store");
        int n=sc.nextInt();
        System.out.println("enter value to be found");
        int value=sc.nextInt();
        int [] array=new int[n];

        System.out.println("enter the values of an array");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(array[i]==value){
                System.out.println("value found at index:"+i);
            }
        }
    }
}
