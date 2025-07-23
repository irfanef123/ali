import java.time.Year;
import java.util.Scanner;

public class Salaryhike {

    public static void main(String[] args) {
        Scanner add = new Scanner(System.in);
        System.out.println("Enter your monthly salary ");
        int SalaryMnth = add.nextInt();
        System.out.println("Enter your performance level");
        int performancelvl = add.nextInt();
        int YearInt = SalaryMnth*12;

        if (performancelvl < 80) {
            int perfor1 = (80/performancelvl)*100;
           int performance = (YearInt/30)*100;
            System.out.println("Your hike is: "+ performance);
        }
    }
}
    

