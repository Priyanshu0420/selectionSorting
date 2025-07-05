public class selectify {
    public static void select(int [] array){
        for(int trace:array){
            System.out.print(trace+" ");
        }
        System.out.println();
        return;
    }

    public static void main(String[] args) {
        int [] array={1,4,3,8,2};
        for(int i=1;i<array.length;i++){
            int current=array[i];
            int j;
            for(j=i-1;j>=0 && current<array[j];j--){
                array[j+1]=array[j];
            }
            array[j+1]=current;
        }
        select(array);
    }
}
