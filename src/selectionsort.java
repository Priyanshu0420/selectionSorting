public class selectionsort {
    public static void array(int[] array){
        for(int i:array){                          //=0;i<array.length;i++
            System.out.print(i+" ");               //array[i]
        }
        System.out.println();
    }
    public static void main(String[] args){
        int [] arr={1,5,3,7,8,4};
        for(int i=0;i<arr.length-1;i++){
            int small=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[small]>arr[j]){
                    small=j;
                }
            }
            int temp = arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
        }
        array(arr);
    }
}
