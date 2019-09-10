import java.util.Scanner;

public class UCLNandBCNN {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a :");
        a = scanner.nextInt();
        System.out.println("Enter b : ");
        b = scanner.nextInt();
        while (a<0 || b<0) {
            System.out.println("Enter a :");
            a = scanner.nextInt();
            System.out.println("Enter b : ");
            b = scanner.nextInt();
        }
            System.out.println("Uoc Chung Lon Nhat La : " + UCLN(a, b));
            System.out.println("Boi Chung Nho Nhat La : " + BCNN(a, b));


    }

    private static int BCNN(int a, int b) {
        return (a*b)/UCLN(a,b);

    }

    private static int UCLN(int a, int b) {
        if (a == 0 || b == 0) {
            System.out.println("Khong Co Uoc Chung Lon Nhat Va Boi Chung Nho Nhat");
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

}
