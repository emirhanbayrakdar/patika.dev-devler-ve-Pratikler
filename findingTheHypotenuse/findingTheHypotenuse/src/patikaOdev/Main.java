package patikaOdev;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a ,b;
        System.out.print("Hipotenüsünü hesaplamak istediğiniz üçgenin kenar uzunluklarını giriniz.\nİlk Kenar: ");
        a=scanner.nextInt();

        System.out.print("İkinci Kenar: ");
        b=scanner.nextInt();
        double hypo = Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs : " + hypo);
    }
}