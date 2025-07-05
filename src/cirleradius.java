import java.util.*;
public class cirleradius {
    public static double circleCircumference(double r){
        return 2*3.14*r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius=sc.nextDouble();
        System.out.println(circleCircumference(radius));
    }
}
