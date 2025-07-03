import java.util.*;
public class sortingUsingBubble {
    static void sortedarray(int [] array){
        for(int x:array){
            System.out.print(x+" ");
        }
       // System.out.println();
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the size of an Array:");
        int size=sc.nextInt();
        int [] array=new int[size];
        //Taking Inputs
        System.out.print("Input the array values:");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        //Output Process
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        sortedarray(array);
    }
}
