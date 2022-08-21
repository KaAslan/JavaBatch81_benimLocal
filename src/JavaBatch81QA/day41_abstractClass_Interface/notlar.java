package JavaBatch81QA.day41_abstractClass_Interface;

public class notlar {
    /*
    cdhild claslar icin standart metod yada variable olusturmak icin kullanilir
    olusturulan methodun body'sini gerek yoktur.
    -->  abstract void eveCagirGel();

    .... standartlarina denince abstract method denir

    Abstract olmayan (concrete) tum child class’lar abstract
method’lari override etmek zorundadir. Boylece tum child
class’lar ayni dinamik ozelliklere (methods) sahip olurlar.

 // abstract classda main method olustursakta olur, olusturmasakta
  --> Eger abstract classsadece classlarin tasımak zorunda oldugu ozellikleri belirlemek icin olusturulduysa
  main method a ihtşyaz olmaz

  ama bir abstract method'da standart belirmek disinda da methodlar calisabilir
  bu durumda ihtiyac olursa main method olusturulabilir

  --> ABSTRACT class olusturmak icin class deklarasyonu abstract class classIsmi{} seklinde olur
        abstract -->> kural koyan
        concrete -->> kurali uygulayan

        Abstract classda abstract olmayan metodlara concrete method denir.
        abstract br methodu abstract keyword ile belirleriz. abstrac varsa method deklarasyonda  abstract methoddur.
        concrete method deklarasyonda abstract keyword olmaz

        concrete bir method deriz public void kapGel(){};

        abstract classlarin ilk concrete childi butun abstract metodlari concrete-(uygulamak- override etmek)
         hale getirmek zorundadir.

        abstract bir classin abstract bic childi herhangi bir metodu implement etmek zorunda degildir.

        !!!!!!!!!Abstract classlar'da obje olusturulamaz.
        abstract classlar constructor barindirir ama obje uretemezler.



        parent classdaki standart belirleyici methodlar(abstract methodlarin) tamami child class tarafindan
        override edilmesi gerekir

        concrete methodlarin (normal methodlarin) override edilme mecburiyeti yoktur.

        child classlari abstract yapmayiz ama yapilabilir.

        toyata classindan (child classindan) obje uretecegimiz bir class degil(altinda araba modelleri olur, o sayfalardan
        olustururz araba objelerini)

        toyota classini da abstract yapmaniz guzel olur

        abstract bir parent classın, concrete bir child class inherit(extends) ederse
        parent abstract classindaki tum abstract methodlari override etmek zorundadir.
        (Eger child class concrete ise(abstract degilse) abstract parent clasin tum ozelliklerini override etmeliyiz.)

        abstract bir classs, abstract baska bir class'i parent edinirse
        parent classdaki tum abstract methodlari override etmek ZORUNDA DEGİLDİR.

        concrete bir class parenti olan tum abstract classlarda abstract olan methodlari implement etmek
        ZORUNDADİR. Ancak parent silsilesinde override edilerek concrete yapilan methodlari
        override etmek zorunda degildir.


        Abstract bir classin ozelliklerini tasiyan bir obje olusturmak istedigimizde
        Data turunu istedigimiz abstract class
        constructori ise child i olan concrete bir classtan seceriz

        List<String> list1=new List<String>();---> calismaz
         List<String> list2= new ArrayList();---> calisir

     */
}
