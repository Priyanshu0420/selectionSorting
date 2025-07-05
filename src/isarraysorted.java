public class isarraysorted {
    public static boolean sort(int index,int [] array){
        if(index==array.length-1){
            return true;
        }
        if(array[index]<array[index+1]){
            return sort(index+1,array);
        } else{
            return false;
        }
    }

    public static void main(String[] args) {
        int [] array={1,3,5,5};
        System.out.println(sort(0,array));
    }
}
