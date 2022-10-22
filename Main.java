import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner ortalama = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = ortalama.nextInt();

        System.out.print("fizik Notunuz : ");
        fizik = ortalama.nextInt();

        System.out.print("kimya Notunuz : ");
        kimya = ortalama.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = ortalama.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = ortalama.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = ortalama.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6;
        System.out.println("Ortalamanız : " + sonuc);

       boolean gecti = (sonuc > 60);
       boolean kaldi = (sonuc <= 60);
       String durum = (gecti)? "Sınıfı Geçti":"Sınıfta Kaldı";
       System.out.println(durum);










    }
}