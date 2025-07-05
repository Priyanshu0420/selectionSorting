public class reccurence_char {
    public static int first=-1;
    public static int last=-1;
    public static void rece(int index,String str,char element){
        if(index==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char current=str.charAt(index);
        if(current==element){
            if(first==-1){
                first=index;
            }
            else{
                last=index;
            }
        }
        rece(index+1,str,element);
    }

    public static void main(String[] args) {
        String str="aabobbbghafkfhka";
        rece(0,str,'a');
    }
}
