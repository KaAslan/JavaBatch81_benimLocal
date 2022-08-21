package Odev_Paylasim;

import java.util.Scanner;

public class soru11_filmTahminOyunu {
    public static void main(String[] args) {
        /*
TASK :
        V for Vendetta
        The Godfather
        Fight Club
        Life of Pi
        Forrest GUmp
         12 Angry Men
        To Kill A Mocking Bird
        Into the Wild
        Dr.No

        yukarıdaki film listinde bulunan filmlerden herhangi birisini
        kullanıcının film ismini görmeden filmin index nosuna göre sectiriniz

        seçilen filmin ismini
        filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
        sağlayan method create ediniz...

        Ahanda TRICK...
        kullanıcının sectiği filmin harf sayısını console yazdırınız.
        kullanıcının sectiği film için tahmin hakkını console yazdırınız.

        kullanıcının her tahmininde kalan hak sayısını console yazdırınız.

        kullanıcının her tahmininde doğru ve yanlış tahmin sayısını console yazdırınız.
        kullanıcının kaybedip
         veya kazandığını
         ve tahmin etmesi gereken filmin ismini console yazdırınız.
        */

        String[] filmler={"V for Vendetta", "The Godfather", "Fight Club", "Life of Pi",
                "Forrest Gump", "12 Angry Men", "To Kill A Mocking Bird", " Into the Wild","Dr. No"};



        //BOLUM1 -  KULLANİCİ FİLM SECME INDEXE GORE
        int girilenIndex;
        do {
            Scanner scan=new Scanner(System.in);
            System.out.println("Lutfen Film ismi tahmininde bulunmak icin 1-"+filmler.length+" arasinda bir sayi giriniz.");
            girilenIndex= scan.nextInt()-1;

        }while(girilenIndex>filmler.length);

        // BOLUM 2 - DATA OLUSTURMA-hazırlık
        String filmAdi=filmler[girilenIndex]; // sonda film adini orjinal sekli ile yazmak icini, bu variable degistirme
        String secilenFilm=filmAdi.toLowerCase().replaceAll("\\W","");// film ismi uzerinde oynama yapmak icin variable

        String kutuString=""; // *'lardan olusan secilenfilm uzunlugunda variable. tahmin edilen harfleri yıldızlarla degistirecegim
        for (int i = 0; i < secilenFilm.length(); i++) {
            kutuString+="*"; }
        //System.out.println("sectigiFilmS >>>>> " +secilenFilm);
        //System.out.println("kutuString >>>  " +kutuString);

        int filmHarfSayisi=secilenFilm.length(); //bosluk silinmis hali ile filmin uzunlugu - karakter sayisi
        int tahminHakki=filmHarfSayisi*2; // kullanicinin tahmin hakkı
        int dogruTahmin=0;
        int yanlisTahmin=0;

        //BOLUM 3 - KULLANİCİ TAHMİN ASAMASİ
        System.out.println("sectiginiz filmde - " + filmHarfSayisi +
                " -  karakter var(bosluklar haric) ve - "+ tahminHakki + " - tahmin hakkınız var");
        System.out.println("-----------------------------  ------------------------------ --------------------------\n");

        String kullaniciHarf;  // kullanicinin tahmin ettigi karakter
        Scanner scan = new Scanner(System.in);

        int kullanilanTahminSayisi=0;

        do {
            System.out.print("Tahminde bulunmak icin harf veya sayi giriniz.(bosluklar yoktur) \n>Tahmininiz -> :");
            kullaniciHarf= scan.next().toLowerCase();
            System.out.println();
            if (kullaniciHarf.length()!=1) {  //KULLANICI 1'DEN FAZLA KARAKTER GIRERSE
                                            // burda kullanici tahmin hakkını azaltmadim.sadece 1 karakterden fazla girmesin yeter
                System.err.println("Hatali tahmin girisi.Tekrar deneyiniz...");


            }else {  // KULLANİCİ 1 TANE KARAKTER GİRDİYSE
                if(!secilenFilm.contains(kullaniciHarf)) {  //KULLANİCİNİN YAZDIGI HARF FİLM'DE YOKSA
                    yanlisTahmin++;
                    kullanilanTahminSayisi++;
                    System.out.println("YANLIS tahmin.Bu harf yok --> " + (tahminHakki - kullanilanTahminSayisi) + " hakkiniz kaldi." +
                            " Yanlis tahmin sayiniz " + yanlisTahmin);
                }

                if (secilenFilm.contains(kullaniciHarf)) { //KULLANİCİNİN YAZDIGI HARF FİLM'DE VARSA
                    int eklenecekHarfYeri = secilenFilm.indexOf(kullaniciHarf); // yıldızlı string icinde yıldızı silip harf yapmak icin
                    if (secilenFilm.indexOf(kullaniciHarf) == secilenFilm.lastIndexOf(kullaniciHarf)) {// kullancinın yazdigi harf filmde  1 tane ise

                        kutuString = kutuString.substring(0, eklenecekHarfYeri) + kullaniciHarf +
                                kutuString.substring(eklenecekHarfYeri + 1, kutuString.length());

                    } else { // kullanci yazdigi harf filmde  1den fazla ise
                        for (int i = 0; i < secilenFilm.length(); i++) {
                            if (secilenFilm.substring(i, i + 1).equals(kullaniciHarf)) {
                                eklenecekHarfYeri = i;
                                kutuString = kutuString.substring(0, eklenecekHarfYeri) + kullaniciHarf +
                                        kutuString.substring(eklenecekHarfYeri + 1, kutuString.length());
                            }

                        }

                    }
                    dogruTahmin++;
                    kullanilanTahminSayisi++;

                    System.out.println("DOGRU tahmin tebrikler --> " + (tahminHakki - kullanilanTahminSayisi) + " hakkiniz kaldi." +
                            " Dogru tahmin sayiniz " + dogruTahmin);
                } //KULLANİCİNİN YAZDIGI HARF FİLM'DE VARSANIN SONU

                System.out.println("TAHMIN ETMEYE CALISTIGINIZ FILM : " +"      ---->>>>   "  + kutuString+ "   <<<<----");

                }
                if (kutuString.equals(secilenFilm)){ // KULLANİCİ, TAHMİN HAKKI BİTMEDEN TUM HARFLERİ BULURSA
                break;
                }
        }while(tahminHakki!=kullanilanTahminSayisi);

        System.out.println();
        System.out.println("--------------------------------------------------------------");
        if (kutuString.equals(secilenFilm) ) {
            System.out.println("-----------------> KAZANDİNİZZZZZZZZZZZZZ <---------------");
            System.out.println("----------------------------------------------------------");

        }else{
            System.out.println("-----------------> KAYBETTINIZ UZGUNUM) <---------------");
            System.out.println("---------------------------------------------------------");

        }
            System.out.println(kullanilanTahminSayisi+ " defa tahminde bulundunuz.\n"+
                "Dogru tahmin sayiniz -->" +dogruTahmin+
                "\nYanlis tahmin sayiniz ---> " + yanlisTahmin +
                "\nSectiginiz Filmin Adi  :  " +filmAdi);





















    }
}
