import java.util.*;
public class Switch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        switch (a) {
            case (10):
                System.out.println("Ten");
                break;
            case (20):
                System.out.println("Twenty");
                break;
            default:
                System.out.println("Diff");
                break;
        }
        sc.close();
    }
}