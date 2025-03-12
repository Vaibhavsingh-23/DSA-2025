import java.util.ArrayList;
import java.util.List;

public class CopyOnWriteArrayList {
    public static void main(String[] args) {

        List<String> l = new ArrayList<>();
        l.add("aa");
        l.add("bb");
        l.add("cc");
        l.add("dd");
        Thread readthread = new Thread(() ->{
        try {
            while (true) {
                for(String s : l) {
                  System.out.println(s);

                  Thread.sleep(100);
                }

            }
        } catch (Exception e) {
         System.out.println(e);
        }
        });

        Thread writethread = new Thread(() ->{
        try {
            while (true) {
                l.add("zz");
                Thread.sleep(500);
                l.add("xx");
                Thread.sleep(500);
            }
        } catch (Exception e) {
         System.out.println(e);
        }
        });
     readthread.start();
     writethread.start();

    }
}
