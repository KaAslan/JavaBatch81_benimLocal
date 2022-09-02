package JavaBatch81QA.day46_maps;

import java.util.*;

public class C01_Maps {

    public static  void main(String[] args) {

        Map<Integer,String> sinifList=new HashMap<>();
        //simdi bu olusturdugumuz bu mep'e key'i int ve value'sude String olan datalar ekleyecez

        sinifList.put(101,"Ali, Can, JDev");// put datalari koymak icin kullaniyoruz
        sinifList.put(102,"Enes, Cem, Testir");// not: burda String kisminda , den sonra bosluk birakmaya dikkat edecez
        sinifList.put(103,"Taha, Emre, Java");
        sinifList.put(104,"Derya, Deniz, Testir");

        // butun siniflist'i yazdirmak istersek;
        System.out.println("sinifList = " + sinifList);
        //sinifList = {101=Ali, Can, JDev, 102=Enes, Cem, Testir, 103=Taha, Emre, Java, 104=Derya, Deniz, Testir}

        System.out.println(sinifList.keySet());//[101, 102, 103, 104] keyset() sadece sayilari veriyor

        System.out.println(sinifList.values());// sedece value 'u yazdirmak istersek
        //[Ali, Can, JDev, Enes, Cem, Testir, Taha, Emre, Java, Derya, Deniz, Testir]


        System.out.println(sinifList.values().size());//4 --> kac tane element  oldugunu dondurur

        //todo soru :tum ogrencilerin isim ve soyisimlerini sira no ile alt alta yazdirin

        Collection<String> tumValueColl=sinifList.values();// tum degerleri bir collection olrak aldik

        // simdi collection'nun data turunu obje olarak degistiriyoyoz

        String[] eachArr;
        int sira=1;

        for (String each:tumValueColl
        ) {
            // burada ki each bize her bir ogrenciye ait ayni yapidaki isim, soyisim,
            // brans bilgilerini iceren Stringler getiriyor
            eachArr=each.split(", ");//"virgul ve bosluga" gore ayirdik
            System.out.println(sira + "- " + eachArr[0] + " " + eachArr[1]);//ayirdigimiz kisimin 0'inci ve 1'inci indexlerini aldik
            sira++;
            /*
            cevap:
            1- Ali Can
            2- Enes Cem
            3- Taha Emre
            4- Derya Deniz
             */
        }
        //todo soru: map'de bulunan ogrencilerin isin ve soyisimlerini birlestirerek
        // bir sinif listesi olusturun

        // once bunlari koyacagimiz bir list olusturalim
        List<String> sinifIsinmSoyisim=new ArrayList<>();

        for (String each:tumValueColl
        ) {

            eachArr=each.split(", ");// virgul'den ayirdik
            sinifIsinmSoyisim.add(eachArr[0] + " " + eachArr[1]);// sifirinci ve birinci index'leri aldik, olusturdugumuz list'e ekledik



        }
        System.out.println(sinifIsinmSoyisim);//[Ali Can, Enes Cem, Taha Emre, Derya Deniz]



    }
}