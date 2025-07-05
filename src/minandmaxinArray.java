import java.util.Scanner;
public class minandmaxinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input the array size
        System.out.println("array of size");
        int size=sc.nextInt();

        int [] array= new int[size];
        System.out.println("input the the values of an array");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        int max=array[0];
        int min=array[0];
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
            if(array[i]>max){
                max=array[i];
            } else if(array[i]<min){
                min=array[i];
            }

        }
        System.out.println("min: "+min);
        System.out.println("max: "+max);


    }
}
