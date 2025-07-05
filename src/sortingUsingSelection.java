import java.util.*;
public class sortingUsingSelection {
    static void iterate(int [] array){
        for(int i:array){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input the array size");
        int value=sc.nextInt();
        int [] array=new int[value];
        //taking input from the user
        System.out.println("input the array values");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        // output process
        for(int i=0;i<array.length-1;i++){
            int smallest_element=i;
            for(int j=i+1;j<array.length;j++){
                if(array[smallest_element]>array[j]){
                    smallest_element=j;
                }
            }
            int temp=array[smallest_element];
            array[smallest_element]=array[i];
            array[i]=temp;
        }

        System.out.print("Sorted array is: ");
        iterate(array);
    }
}
