package mirac_practise;

import java.util.Arrays;

public class Q0_SortedArraySolution2 {
    public  static void main(String[] args) {

        /*

Integer olarak artan değerler şeklinde verilen dizinin elemanlarının karesini alıp yine artan
değerlerde ekrana yazdıran metod oluşturunuz

Örnek :

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]

 */
        int num[] = {-4, -1, 0, 3, 10};

       int[] num2= Arrays.stream(num).map(x->x*x).sorted().toArray();

        System.out.println(Arrays.toString(num2));


    }

}
