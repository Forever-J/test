import java.util.*;

public class FixedSizeList {
    public static void main(String[] args) {
        List fixedList = Arrays.asList("java", "ios", "Andriod");
        System.out.println(fixedList.getClass());
        fixedList.forEach(System.out::println);
        fixedList.add("javaee");
        fixedList.remove("java");
    }
}
