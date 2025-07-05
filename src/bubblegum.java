public class bubblegum {
    public static void sort(int [] array){
        for(int each:array){
            System.out.print(each+" ");
        }
        System.out.println();
        return;
    }

    public static void main(String[] args) {
        int [] array={1,3,4,5,2,9,7,50};
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]) {
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }

        }
        sort(array);
    }
}
