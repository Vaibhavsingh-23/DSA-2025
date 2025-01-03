import java.util.*;


public class ListExample {
    public static void main(String []args ){
        List<String> list =new ArrayList<String>();
        list.add("apple");
        list.add("banana");
        list.add("kiwi");
        list.sort((String o1, String o2)-> o1.length() - o2.length());
        System.out.println(list);
    }
}
