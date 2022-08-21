package mirac_practise;

import java.util.Arrays;

public class Q0_SortedArraySolution {
    public  static void main(String[] args) {

        /*

Integer olarak artan değerler şeklinde verilen dizinin elemanlarının karesini alıp yine artan
değerlerde ekrana yazdıran metod oluşturunuz

Örnek :

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]

 */
       int num[] = {-4,-1,0,3,10};

        System.out.println(Arrays.toString(sortedArray(num)));


    }
    public static int[] sortedArray(int[] num){

        for (int i = 0; i < num.length; i++) {
            num[i]=num[i]*num[i];
        }
            Arrays.sort(num);
        return num;
    }
    /*
    int i = 0  // busekilde daha efektif calisir.her loopta yeni bir i variable olusturmaz
    for (   ; i < num.length; i++) {
            num[i]=num[i]*num[i];
        }
            Arrays.sort(num);
        return num;
     */








}
