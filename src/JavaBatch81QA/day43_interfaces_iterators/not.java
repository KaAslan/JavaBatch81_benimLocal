package JavaBatch81QA.day43_interfaces_iterators;

public class not {
    /*
    1. Java`da Full abstraction saglayarak, child class`larin
   mutlaka yerine getirmesi gereken ozellikleri belirleyen bir yapidir.
2. Bu haliyle interface, child class`larin her alanini mecburen doldurmasi gereken bir sablon gibidir.
3. Interface`lerde concrete method olmaz.
4. Interfacelerde tum variable`lar > PUBLIC, STATIC ve FINAL dir. Biz bu anahtar kelimeleri yazsak da yazmasak da
   Java bu sekilde kabul eder.
5. Interface`lerdeki tum methodlar ise publi ve abstract`tir.
    Yine biz bu anahtar kelimeleri yazsak da yazmasak da Java bu sekilde kabul eder.
6. Bir concrete class birden fazla class`i inherit edemez ancak, birden fazla interface`i implemnt edebilir.
Bu durumda:
        - eger birden fazla parent interface`de ayni isimde variable varsa interfaceismi.variableismi
        - eger birden fazla parent interface`de ayni isimde ve ayni return type`da method varsa
        hangisini override ettigi onemsiz oldugundan sorun cikmaz.
        - Ancak ayni isim , farkli return typ`lari olan methodlar var ise  CTE  olur.
7. Interface`de body`si olan method yazilabilir ancak bu istisnai bir durumdur ve kurallari bozmaz.
     */
}
