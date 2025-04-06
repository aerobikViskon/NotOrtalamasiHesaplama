 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mat,fizik,kimya,turkce,tarih,muzik;

        System.out.print("Matematik notunuzu giriniz: ");
        mat = sc.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = sc.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = sc.nextInt();

        System.out.print("Turkce notunuzu giriniz: ");
        turkce = sc.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih = sc.nextInt();

        System.out.print("Muzik notunuzu giriniz: ");
        muzik = sc.nextInt();

        int ort  = (mat + fizik + kimya + turkce + tarih + muzik);
        double snc = ort / 6.0;

        System.out.println("Not Ortalamanız: " + snc);

        String durum = (snc >= 60.0) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(durum);
    }
}
