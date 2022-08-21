package JavaBatch81QA.day24_arrayLists_ForEachLoop_odevYap;

import java.util.ArrayList;
import java.util.List;

public class K_KendimUydurdumArrdenListOlusturmaString {
    /*
    Arrayden list olusturan bir method olusturun.

     */

    public static void main(String[] args) {

        String [] metinArr={"zeynep" , "hale" , "enes" , "kagan" , "aslan"};

        List<String> metinList=new ArrayList<>();

        metinArryiListeCevir(metinArr,metinList);
        System.out.println(metinList);
    }

    private static List metinArryiListeCevir(String[] metinArr, List<String> metinList) {

        for (int i = 0; i < metinArr.length; i++) {

            metinList.add(i,metinArr[i]);

        }

        return metinList;

    }















}
