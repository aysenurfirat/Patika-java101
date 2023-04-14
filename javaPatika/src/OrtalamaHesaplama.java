import java.util.Scanner;
public class OrtalamaHesaplama {
    public static void main(String[] args) {

        /* DEĞİŞKENLER */
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner input = new Scanner(System.in); /* SCANNER SINIFI */
        /* KULLANICIDAN DEĞER AL */
        System.out.println("Matematik notunuz :");
        mat = input.nextInt();
        System.out.println("Fizik notunuz :");
        fizik = input.nextInt();
        System.out.println("Kimya notunuz :");
        kimya = input.nextInt();
        System.out.println("Türkçe notunuz :");
        turkce = input.nextInt();
        System.out.println("Tarih notunuz :");
        tarih = input.nextInt();
        System.out.println("Müzik notunuz :");
        muzik = input.nextInt();
        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double ortalama = toplam / 6d;
        System.out.println("Not ortalamanız = " + ortalama);
        System.out.println(ortalama>60?"Başarılı":"Kaldınız");
    }

}
