public class harnoi {
    public static void hardoi(String src,String help,String dest,int n){
        if(n==1){
            System.out.println("transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        hardoi(src,dest,help,n-1);
        System.out.println("transfer disk "+n+" from "+src+" to "+dest);
        hardoi(help,src,dest,n-1);
    }

    public static void main(String[] args) {
        int n=3;
        hardoi("SRC","HELPER","DESTINATION",n);
    }
}
