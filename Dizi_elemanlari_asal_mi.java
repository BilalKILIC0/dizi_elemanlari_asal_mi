package dizi_elemanlari_asal_mi;

import java.util.Scanner;

public class Dizi_elemanlari_asal_mi {

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        //Değişkenleri Tanımladık
        int sayac = 0;
        int asal_toplam = 0;

        //Kullanıcıdan Dizinin Uzunluğunu Aldık
        System.out.println("Lütfen Dizinizin Elelman Sayısını Belirleyiniz :");
        int eleman_sayisi = input.nextInt();
        //Enter Boşa Düşsün Diye Kullandık
        input.nextLine();

        //Sayılar Dizimizi Tanımladık
        int sayilar[] = new int[eleman_sayisi];

        //Kullanıcıya Bilgi Verdik
        System.out.println("\nLütfen Elelmanları Giriniz :\n");

        //For döngüsü ile Kullanıcının girdiği Değerleri Saraylar Diziye Ekledik (Dizinin Eleman Sayısına göre)
        for (int i = 0; i <= sayilar.length - 1; i++) {

            System.out.println((i + 1) + ". Dizi Elelmanını Giriniz :");
            sayilar[i] = input.nextInt();
            //Enter Boşa Düşssün Diye Ekledik
            input.nextLine();

        }

        //Dizinin indeksine göre Elemanları artırdık
        for (int i = 0; i <= sayilar.length - 1; i++) {

            //J 'yi Burada Tanımladık Çünkü Toplamda İşime Yarayacak
            int j;

            //Asal Olup Olmadığına Baktık
            for (j = 2; j < sayilar[i]; j++) {

                //Sayılar dizisinin [i] . İndeksinde ki Sayı j ye bölünürse sayacı 1 artırdık
                if (sayilar[i] % j == 0) {

                    sayac++;
                    //Breakla kırdık
                    break;
                }

            }

            //Asal Olup Olmadığını Doğruladık
            if (sayac == 0 && sayilar[i] != 1) {

                //Asal Sayıyı Ekrana Yazdırdık
                System.out.println("Dizinin Asal Olan Sayısı : " + sayilar[i]);
                //Toplamı j ile Topladık
                asal_toplam += j;

            }
            //Sayacı sıfırladım çünkü girilen Sayı asal büyük bir sayı değilse ondan sonrki sayıları kontrol etmez
            sayac = 0;
        }

        //Asal Toplamları
        System.out.println("Asal Sayıların Toplamı : " + asal_toplam);

    }
}
