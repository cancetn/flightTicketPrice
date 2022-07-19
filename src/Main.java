import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Patika.dev egitim kampi proje odevidir.

        /*Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

        Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
         */

        int mesafe, yas, yolculukTipi;
        double toplamTutar, normalTutar, yasIndirimi, indirimliTutar, yonIndirimi;

        Scanner inp = new Scanner(System.in);

        System.out.println("Gidilecek mesafeyi KM cinsinden giriniz = ");

        mesafe = inp.nextInt();

        System.out.println("Yasinizi giriniz = ");

        yas = inp.nextInt();

        System.out.println("Yolculuk tipini giriniz = (1=> Tek Yon , 2=> Gidis Gelis)");

        yolculukTipi = inp.nextInt();

        switch(yolculukTipi){
            case 1 : {
                if (yas <= 0 && mesafe <= 0) {
                    System.out.println("Gecersiz veri girisi !");
                }
                if (yas < 12) {
                    normalTutar = mesafe * 0.10;
                    yasIndirimi = normalTutar * 0.50;
                    indirimliTutar = normalTutar - yasIndirimi;
                    toplamTutar = indirimliTutar;
                    System.out.println("Tek yön 12 yas altı indirimli bilet fiyati = " + toplamTutar);
                    break;
                } else if (yas >= 12 && yas <= 24) {
                    normalTutar = mesafe * 0.10;
                    yasIndirimi = normalTutar * 0.10;
                    indirimliTutar = normalTutar - yasIndirimi;
                    toplamTutar = indirimliTutar;
                    System.out.println("Tek yön 12-24 yas arasi indirimli bilet fiyati = " + toplamTutar);
                    break;

                }
                if (yas > 65) {
                    normalTutar = mesafe * 0.10;
                    yasIndirimi = normalTutar * 0.30;
                    indirimliTutar = normalTutar - yasIndirimi;
                    toplamTutar = indirimliTutar;
                    System.out.println("Tek yön 65 yas ustu indirimli bilet fiyati = " + toplamTutar);
                    break;

                } else {
                    normalTutar = mesafe * 0.10;
                    System.out.println("Tek yon bilet fiyati = " + normalTutar);
                    break;

                }
            }
            case 2: {
                if (yas <= 0 && mesafe <= 0) {
                    System.out.println("Gecersiz veri girisi !");
                }
                if (yas < 12) {
                    normalTutar = mesafe * 0.10;
                    yasIndirimi = normalTutar * 0.50;
                    indirimliTutar = normalTutar - yasIndirimi;
                    yonIndirimi = indirimliTutar * 0.20;
                    toplamTutar = (indirimliTutar - yonIndirimi) * 2;
                    System.out.println("Gidis donus 12 yas altı indirimli bilet fiyati = " + toplamTutar*2);
                    break;

                } else if (yas >= 12 && yas <= 24) {
                    normalTutar = mesafe * 0.10;
                    yasIndirimi = normalTutar * 0.10;
                    indirimliTutar = normalTutar - yasIndirimi;
                    yonIndirimi = (indirimliTutar * 0.20);
                    toplamTutar = (indirimliTutar - yonIndirimi) * 2 ;
                    System.out.println("Gidis donus 12-24 yas arasi indirimli bilet fiyati = " + toplamTutar);
                    break;


                }
                if (yas > 65) {
                    normalTutar = mesafe * 0.10;
                    yasIndirimi = normalTutar * 0.30;
                    indirimliTutar = normalTutar - yasIndirimi;
                    yonIndirimi = (indirimliTutar * 0.20);
                    toplamTutar = (indirimliTutar - yonIndirimi) * 2 ;
                    System.out.println("Gidis donus 65 yas ustu indirimli bilet fiyati = " + toplamTutar*2);
                    break;
                } else {
                    normalTutar = mesafe * 0.10;
                    yonIndirimi = normalTutar * 0.20;
                    toplamTutar = (normalTutar - yonIndirimi) * 2;
                    System.out.println("Gidis donus bilet fiyati = " + toplamTutar*2);
                    break;

                }
            }
            default: System.out.println("Gecersiz veri girdiniz!");


        }




    }
}
