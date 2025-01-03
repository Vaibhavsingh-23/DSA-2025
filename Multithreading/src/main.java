public class main {
    public static void main(String[] args) throws InterruptedException {
        Odd o1 = new Odd();
        o1.start();
        o1.join();
        Even e1= new Even();
        e1.start();

    }
}
