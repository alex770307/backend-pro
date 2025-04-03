package consult_01.functionalInterfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringSortSpecialSolution {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();

        myList.add("DDD");
        myList.add("FFFF");
        myList.add("AAAAA");
        myList.add("CC");
        myList.add("BBBBBB");
        myList.add("E");
        myList.add("HHHHHHH");

        System.out.println(myList);


        // STEP 3

//        Comparator<String> myComparator = new Comparator<String>() {
//            @Override
//            public int compare(String string1, String string2) {
//                return string1.length() - string2.length();
//            }
//        };
//
//        Collections.sort(myList, myComparator);
//        System.out.println(myList);


        // STEP 4

//        Comparator<String> myComparator = (String string1, String string2) -> {
//            return string1.length() - string2.length();};
//
//        Collections.sort(myList, myComparator);
//        System.out.println(myList);

        // STEP 5

//        Comparator<String> myComparator = (string1, string2) -> string1.length() - string2.length();
//
//        Collections.sort(myList, myComparator);
//        System.out.println(myList);


        // STEP 6

        Collections.sort(myList, (string1, string2) -> string1.length() - string2.length());
        System.out.println(myList);


    }
}
