import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
      int lenght1,lenght2,lenght3,area;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first lenght: ");
        lenght1 = scan.nextInt();
        System.out.print("Enter the second lenght: ");
        lenght2 = scan.nextInt();
        System.out.print("Enter the third lenght: ");
        lenght3 = scan.nextInt();
        int region = lenght1+lenght2+lenght3;
        int u = region/2;
        area=u*(u-lenght1)*(u-lenght2)*(u-lenght3);
        System.out.println("Area of triangle:"+sqrt(area));
    }
}