import java.util.Scanner;
public class trialclass {
    public static int points(int[] array1, int[] array2) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i < array1.length-1; i++) {
            for (int j = 1; j < array2.length-1; j++) {
                //System.out.println(arr2);
                if (array1[i] > array2[j]) {
                    sum1++;
                } else if (array2[j]>array1[i]) {
                    sum2++;
                } else {
                        sum1 = sum2;
                    }
                }
            }
      //  } 223 113
        System.out.print(sum1);
        System.out.println(sum2);
        return sum1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // System.out.println("array 1 size");
        int a = sc.nextInt();
     //   System.out.println("array 2 size");
        int b = sc.nextInt();
        int[] arr1 = new int[a];
        int[] arr2 = new int[b];
        for (int x = 0; x < arr1.length; x++) {
            arr1[x] = sc.nextInt();
        }
        for (int y = 0; y < arr2.length; y++) {
            arr2[y] = sc.nextInt();
        }
        points(arr1, arr2);
    }
}

