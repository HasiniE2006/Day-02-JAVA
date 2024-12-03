import java.util.*;
public class Swap {
    public static void main(String[] args) {
        int boy,girl;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter boy choclates");
        boy=sc.nextInt();
        System.err.println("enter girl choclates");
        girl=sc.nextInt();
        int temp=boy;
        boy=girl;
        girl=temp;
        System.out.println(boy);
        System.out.println(girl);
    
    }
    
}
