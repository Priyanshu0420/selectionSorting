public class allXback {
    public static void shift(String str,int index,String newstr,int count){
        if(index==str.length()){
            for(int i=0;i<count;i++){
                newstr += 'x';
            }
            System.out.println(newstr);
            return;
        }
        char current = str.charAt(index);
        if(current == 'x'){
            count++;
            shift(str,index+1,newstr,count);
        } else{
            newstr +=current;
            shift(str,index+1,newstr,count);
        }
    }

    public static void main(String[] args) {
        String name = "prixanshu";
        shift(name,0,"",0);
    }
}
