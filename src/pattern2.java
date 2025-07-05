public class pattern2 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int x=1;x<=5;x++){
            for(int y=5;y>=x;y--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
