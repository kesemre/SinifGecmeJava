import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;
        int totalpoint=0;
        double avagere;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Matematik notunuzu giriniz");
        mat = input.nextInt();
        System.out.print("Lütfen Fizik notunuzu giriniz");
        fizik = input.nextInt();
        System.out.print("Lütfen Türkçe notunuzu giriniz");
        turkce = input.nextInt();
        System.out.print("Lütfen Kimya notunuzu giriniz");
        kimya = input.nextInt();
        System.out.print("Lütfen Müzik notunuzu giriniz");
        muzik = input.nextInt();
        if (mat>=0 && mat<100){
            totalpoint += mat;
        }
        if (fizik>=0 && fizik<100){
            totalpoint +=fizik;
        }
        if (turkce>=0 && turkce<100){
            totalpoint += kimya;

        }
        if (muzik>=0 && muzik<100){
            totalpoint += muzik;

        }
        if (kimya>=0 && kimya<100){
            totalpoint += kimya;}
        avagere = (totalpoint/5);
        System.out.println(avagere);
        if (avagere>=55){
            System.out.println("sınıfı geçtiniz tebrikler");

        }
        else{
            System.out.println("sınıfta kaldınız seneye görüşürüz");
        }

    }
}
