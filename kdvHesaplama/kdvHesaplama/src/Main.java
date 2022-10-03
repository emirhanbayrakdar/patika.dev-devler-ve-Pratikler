import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("KDV tutarını hesaplamak istediğiniz para miktarını giriniz : ");


        double money, kdv = 0.18;
        money = scanner.nextDouble();
        double kdvTutar = (money * kdv);


        System.out.println("KDV'siz fiyat : " + money + " TL");
        System.out.println("KDV'li fiyat : " + (money + kdvTutar) + " TL");
        System.out.println("KDV tutar : " + kdvTutar + " TL");

    }
}

