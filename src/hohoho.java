import java.util.Scanner;
public class hohoho {
    public static int arraysum(int[] array){
        int sum=0;
        for(int i=0;i<=array.length;i++){
            sum=sum+array[i];
        }
        System.out.println(sum);
        return sum;
    }
    public static void main(String[] args) {
      /*  int sum=0;
        int n=1;
        int i;
        for( i=n;i<=10;i++){
            System.out.println(8*i);

        }
        int click=sum+(8*i);
        System.out.println(click);
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("row");
        int x=sc.nextInt();
        System.out.println("col.");
        int y = sc.nextInt();
        int [] [] array=new int [x] [y];
        System.out.println("values");
        for(int i=0;i<x;i++) {
            for(int j=0;j<y;j++) {
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("output");
        for(int i=0;i<x;i++){
           for(int j=0;j<y;j++) {
               System.out.print(array[i][j]+" ");
           }
        }
        System.out.println();
        //arraysum(array);

    }
}
