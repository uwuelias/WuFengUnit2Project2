import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String str = "(25, 5)";
        str = str.replace("[(,)]", "");
        Integer.parseInt(str);
        Scanner scan = new Scanner(System.in);
        double lol1 = scan.nextDouble();
        double lol2 = scan.nextDouble();
        System.out.println(Integer.parseInt(str));
    }
}
