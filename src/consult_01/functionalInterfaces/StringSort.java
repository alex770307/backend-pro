package consult_01.functionalInterfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringSort {
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

//        Collections.sort(myList);
//        System.out.println(myList);

        // STEP 1

//        StringLengthComparator comparator = new StringLengthComparator();
//        Collections.sort(myList, comparator);
//        System.out.println(myList);


        // STEP 2

//        Collections.sort(myList, new StringLengthComparator());
//        System.out.println(myList);

        // STEP 3

        Comparator<String> myComparator = new Comparator<String>() {
            @Override
            public int compare(String string1, String string2) {
                return string1.length() - string2.length();
            }
        };

        Collections.sort(myList, myComparator);
        System.out.println(myList);
    }
}
