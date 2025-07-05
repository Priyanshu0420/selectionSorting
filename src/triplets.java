import java.util.Scanner;

public class triplets {
    public static void compare(int[] array1,int [] array2){
        int sum1=0;
        int sum2=0;
        for(int i=0;i<3;i++){
            if(array1[i]<array2[i]){
                sum1++;
            } else if(array2[i]<array1[i]){
                sum2++;
            } // else{
           //     sum1=sum2;
        //    }
        }
        System.out.print(sum2);
        System.out.println(sum1);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("array 1 size");
        int a = 3;
        //   System.out.println("array 2 size");
        int b = 3;
        int[] arr1 = new int[a];
        int[] arr2 = new int[b];
        for (int x = 0; x < arr1.length; x++) {
            arr1[x] = sc.nextInt();
        }
        for (int y = 0; y < arr2.length; y++) {
            arr2[y] = sc.nextInt();
        }
        compare(arr1, arr2);
    }
}
