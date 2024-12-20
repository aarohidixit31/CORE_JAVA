 import java.util.Scanner;

public class grossSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int basicSalary = sc.nextInt();

        double hda = 0.10*basicSalary;
        double da = 0.20*basicSalary;
        double grossSalary = basicSalary+hda+da;
        System.out.println((int)grossSalary);
    }
};
