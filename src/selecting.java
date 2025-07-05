public class selecting {
    public static void supp(int[] array){
        for(int j:array){
            System.out.print(j+" ");
        }
        System.out.println();
        return;
    }

    public static void main(String[] args) {
        int [] array={8,4,1,0,3,6};
        for(int i=0;i<array.length-1;i++){
            int small=i;
            for(int j=i+1;j<array.length;j++) {
                if (array[small] > array[j]) {

                    small = j;
                }
            }
                int temp = array[small];
                array[small] = array[i];
                array[i]=temp;

        }
        supp(array);
    }
}
