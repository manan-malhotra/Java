import java.util.*;
public class PoundToKgs{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int pound;
        double kgs;
        System.out.println("Enter weight in pounds: ");
        pound=sc.nextInt();
        kgs=pound*0.45359237;
        System.out.println("Weight in kgs is "+kgs);
        sc.close();
    }
}