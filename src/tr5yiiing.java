public class tr5yiiing {
    public static void array(int [] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] array = {2,5,78,34,8};
        //sort using bubble sort;

        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                     array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        array(array);
    }
}
