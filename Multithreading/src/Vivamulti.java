public class Vivamulti {
    public static void main(String[] args) {

        viva v= new viva();
        v.start();
        vivarunnable vr = new vivarunnable();
        Thread t1 = new Thread(vr);
        t1.start();
        System.out.println("hello vaibhav");
        System.out.println(Thread.currentThread().getName());
    }
}
