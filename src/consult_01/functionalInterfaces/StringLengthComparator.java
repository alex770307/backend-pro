package consult_01.functionalInterfaces;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String string1, String string2) {
        return string1.length() - string2.length();
    }
}
