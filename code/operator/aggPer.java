import java.util.Scanner;

public class aggPer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] subjects = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            subjects[i] = in.nextInt(); 
            sum += subjects[i]; // Take input for each element
        }
        int agg = sum;
        int totalmarks = 500;
        int per = (int)((sum/totalmarks)*100);
        System.out.println(agg+"  "+per);
        

    }
}
