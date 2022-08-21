package JavaBatch81QA.day35_InheritancedaConstructorKullanimi;

public class HCorolla extends GToyota{
    HCorolla(){
        System.out.println("HCorolla parametresiz cons");
    }
    HCorolla(String isim){
        super(isim); // extend edinilen sayfada paremetreli const.a gider
        System.out.println("HCorolla parametreli cons");
    }
}