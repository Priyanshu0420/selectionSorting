import java.util.Scanner;
public class leap {
    public static int arraysum(int[] array){
        int sum=0;
      //  System.out.println(array.length);
        for(int i=0;i<=array.length-1;i++){
            sum=sum+array[i];
         //   System.out.println(sum);
        }
        System.out.println(sum);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("row");
        int x=sc.nextInt();
       // System.out.println("col.");
      //  int y = sc.nextInt();
        int  [] array=new int [x] ;
      //  System.out.println(array.length);
        System.out.println("values");
        for(int i=0;i<x;i++) {

                array[i] = sc.nextInt();
        }
        System.out.println("output");
        for(int i=0;i<x;i++){

                System.out.print(array[i]+" ");

        }
        System.out.println();

        arraysum(array);

    }
}
