import java.util.Scanner;
public class arraysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row value:");
        int row=sc.nextInt();
        System.out.println("enter coln value:");
        int coln=sc.nextInt();
        //input matrix 1
        int [] [] array1=new int[row][coln];
        System.out.println("enter array1 values");
        for(int i=0;i<row;i++){
            for(int j=0;j<coln;j++){
                array1[i][j]=sc.nextInt();
            }
        }
        // input array matrix 2
        int [] [] array2=new int[row][coln];
        System.out.println("enter array2 values");
        for(int i=0;i<row;i++){
            for(int j=0;j<coln;j++){
                array2[i][j]=sc.nextInt();
            }
        }
        //input array matrix 2
        int [] [] result=new int[row][coln];
        for(int i=0;i<row;i++){
            for(int j=0;j<coln;j++){
                result[i][j]=array1[i][j] +array2[i][j];
                System.out.print(result[i][j]+" ");
            }
        }
        System.out.println();
        }
    }

