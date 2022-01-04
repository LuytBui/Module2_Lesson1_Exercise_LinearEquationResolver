import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Chương trình giải phương trình bậc nhất:   ax + b = 0");
        System.out.println("Nhập số a: ");
        float a = sc.nextFloat();
        System.out.println("Nhập số b: ");
        float b = sc.nextFloat();


        if (a == 0){
            if (b ==0){
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.printf("Phương trình vô nghiệm.");
            }
        } else {
            System.out.println("Phương trình có nghiệm là: x="+ -b/a);
        }
    }
}
