package consult_01.streamAPI.streamAPI;

import java.util.Arrays;
import java.util.List;

public class Stream3 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("10","20","1","10","50","25","20","25","10");

        System.out.println(strings);

        // filter & count

        long result = strings.stream() //
                .filter(str -> str.equals("10")) // возьми все данные из входящего потока данных и
                // отфильтруй их согласно условию: к каждому элементу потока примени фильтр эквивалентен ли этот элемент "10"
                // и на выходе этого метода в потоке данных останутся ТОЛЬКО элементы, которые удовлетворяют условию
                .count(); // подсчитай общее количество элементов в потоке

        System.out.println("Result filtering and counting: " + result);


        // sorted

        List<String> sortedList = strings.stream()
                // метод sort() сортирует элементы потока данных по умолчанию (естественный порядок)
                // если надо либо задать новый порядок сортировки или сформулировать его к нашим типам данных,то
                // используем Comparator и в виде lambda его описываем: как сравнивать два элемента
                // например - два string в обратном порядке : (str1,str2) -> (str2.compareTo(str1))
                //.sorted((str1,str2) -> (str2.compareTo(str1)))
                .sorted()
                .toList(); // равносильно collect(Collectors.toList())

        System.out.println("Result of sorting: " + sortedList);


        // sorting and filtering and limit
        // взять нашу коллекцию, оставить только первые три элемента которые в цифровом формате будут > 10

        List<String> result3 = strings.stream()
                .sorted()
                .filter(str -> Integer.parseInt(str) > 10)
                .limit(3)
                .toList();

        System.out.println("Result sorting, filtering and limit : " + result3);


        // sorting and filtering and skip
        // взять нашу коллекцию, оставить только элементы без первых трех которые в цифровом формате будут > 10

        List<String> result4 = strings.stream()
                .sorted()
                .filter(str -> Integer.parseInt(str) > 10)
                .skip(3)
                .toList();

        System.out.println("Result sorting, filtering and skip : " + result4);

        // distinct - убирает дубликаты

        List<String> result5 = strings.stream()
                .sorted()
                .distinct()
                .toList();

        System.out.println("result of sorting and distinct: " + result5);


        // peek

        System.out.println("Result of peek() method: ");
        List<String> result6 = strings.stream()
                .peek(element -> System.out.println(element + " hello!"))
                .toList();

        System.out.println(result6);


        // map - модификация данных

        System.out.println("Result of map() method: ");

        List<Integer> result7 = strings.stream()
                .sorted()
                .map(x -> Integer.parseInt(x))
                .map(x -> x * x)
                .toList();

        System.out.println(result7);

    }
}
