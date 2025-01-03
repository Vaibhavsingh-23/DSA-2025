public class Doubt1 extends Thread{
    public void run(){
        System.out.println("First name");
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println(currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException {
        Doubt1 d1 = new Doubt1();
        System.out.println(d1.currentThread().getName());
        d1.start();
        System.out.println(d1.getState());
        Thread.sleep(100);
        System.out.println(d1.currentThread().getName());
        System.out.println(d1.getState());
    }
}
