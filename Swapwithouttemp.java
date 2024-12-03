import java.util.*;
public class Swapwithouttemp {
    public static void main(String[] args) {
        int boy,girl;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter boy choclates");
        boy=sc.nextInt();
        System.err.println("enter girl choclates");
        girl=sc.nextInt();
        boy=boy+girl;
        girl=boy-girl;
        boy=boy-girl;
        System.out.println(boy);
        System.out.println(girl);
    
    }
    
}
