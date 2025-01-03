public class Even extends Thread{
    private boolean l = false;
    public void run(){
        if(!l) {
            for (int i = 0; i < 11; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
            try {
                notify();
                l = true;
            }
            catch (Exception e){}
        }
    }
}

