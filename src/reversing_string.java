public class reversing_string {
    public static void reverse(int index,String str){
        if(index==0){
            System.out.print(str.charAt(index));
            return;
        }

        System.out.print(str.charAt(index));
        reverse(index-1,str);
        // System.out.print(str.charAt(index-1));
    }

    public static void main(String[] args) {
        String str ="priyanshu";
        System.out.println(str.toUpperCase());
        reverse(str.length()-1,str);
    }
}
