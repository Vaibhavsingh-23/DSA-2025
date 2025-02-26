public class TOH {
    public static void main(String[] args) {
        int n =5;
        char source= 's';
        char helper = 'h';
        char destination = 'd';

        toh(n , source  , helper   , destination );
    }
    public static void toh(int n , char source , char helper , char destination){

        if(n < 1 ){
            return;
        }
        toh(n-1, source , destination , helper);
        System.out.println("move a disk from   "  + source +"  to  "+ destination);
        toh(n-1, helper,source , destination);

    }
}
