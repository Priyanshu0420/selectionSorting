public class insertion_sort {
    public static void insertion(int [] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        return;
    }

    public static void main(String[] args) {
        int [] array={1,4,2,6,9,0};
        for(int i=1;i<array.length;i++){
            int current=array[i];
            int j=i-1;
            while(j>=0 && current<array[j]){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=current;
        }
        insertion(array);
    }
}
