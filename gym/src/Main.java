import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = input.nextInt();
        String[] a = new String[n];
        System.out.print("Enter names: ");
        for(int i = 0; i < n; i++){
            a[i] = input.next();
        }
        System.out.println(LineThemUp.solve(a));
    }
}