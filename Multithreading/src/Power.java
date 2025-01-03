public class Power {
    public static  void main(String[] args){
        int i=0,n=23;
        int m=0;
        while(n!=0){
            int r=n%10;
            m = m*10 +r;
            n/=10;
            System.out.println(m);
        }
        System.out.println(m);
        i=m;
        double k=23;
        while(i!=0){
            k=k*23;
            i--;

        }
        System.out.println(k);

    }
}
