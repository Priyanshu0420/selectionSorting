public class inserting {
    public static void sorted(int [] array){
        for(int tracing:array){
            System.out.print(tracing+" ");
        }
        System.out.println();
        return;
    }

    public static void main(String[] args) {
        int [] array={5,7,9,3,1,4,77,2};
        for(int i=0;i<array.length;i++){
            int current=array[i];
            int j;
            for(j=i-1;j>=0 && current>array[j] ;j--){
                array[j+1]=array[j];
            }
            array[j+1]=current;
        }
        sorted(array);
    }
}
