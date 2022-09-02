package JavaBatch81QA.day44_collections;

public class iterators_K_notlar {

    /*
    java.util.Iterator<E> arayüzü koleksiyonu baştan sona doğru tek yönlü tarar.
    java.util.ListIterator<E> arayüzü ise, koleksiyonu baştan sona doğru
            ya da sondan başa doğru tarayabilir.

    Iterator<E> arayüzü eski Enumeration arayüzü yerine konmuştur
     */

/*
Java collection’a ait her koleksiyon sınıfının bir iterator() metodu vardır. Bu metot koleksiyonun ilk
öğesinden başlar, son öğesine doğru bütün öğeleri tarar. Dolayısıyla, koleksiyondaki her öğeye erişim
sağlanır. Metodu kullanabilmek için şunlar yapılmalıdır:

1. Hangi koleksiyon için gerekiyorsa, ona ait iteraor() metodu çağrılır.
2. hasNext() metodu yardımıyla koleksiyonu tarayacak döngü kurulur. Bu metot,
koleksiyonda henüz döngü adımlarının erişmediği öğe varsa true değerini verir.
3. Sonraki öğeye erişmek için next() metodunu kullan.

List arayüzünü kılgılayan???? koleksiyonlar için Iterator yerine ListIterator kullanılır. ListIterator,
listeyi baştan sona ya da sondan başa doğru tarama yeteneğine sahiptir; dolayısıyla sözkonusu listeler
için tercih edilmelidir.
*/
}
