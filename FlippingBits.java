import java.util.*;
public class FlippingBits {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println(a^(1<<b));
    }

    
}
