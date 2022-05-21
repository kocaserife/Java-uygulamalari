import java.util.Scanner;

public class not {
    public static void main(String[] args) {
int  matematik, fizik, kimya, biyoloji ,felsefe, edebiyat;

    Scanner input = new Scanner(System.in);

    System.out.print("matematik notunuzu giriniz: " );
    matematik = input.nextInt();

        System.out.print("fizik notunuzu giriniz: " );
        fizik = input.nextInt();

        System.out.print("kimya notunuzu giriniz: " );
        kimya = input.nextInt();

        System.out.print("biyoloji notunuzu giriniz: " );
        biyoloji = input.nextInt();

        System.out.print("felsefe notunuzu giriniz: " );
        felsefe = input.nextInt();

        System.out.print("edebiyat notunuzu giriniz: " );
        edebiyat = input.nextInt();

        int  toplam = (matematik+ fizik+ kimya+ biyoloji+ felsefe+ edebiyat );
        double sonuc = toplam/6.0;
        System.out.print("ortalamanız :  "+ sonuc);



        boolean kosul = sonuc >= 60;
        String gectinmi = kosul ? "Geçtiniz" : "Kaldınız";
        System.out.println(gectinmi);


    }
}