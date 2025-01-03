public class search {
    public static void main(String[] args){

        int[] arr = {3,8,3,6,5,4,3,2,1,12};
        int n = arr.length-1;
        while(n>=0){
            if(arr[n]==3){
                System.out.println(n);
                n= --n;
               // break;
            }
            else{
            n=n-1;                //System.out.println(n);
            }
        }

    }
}
