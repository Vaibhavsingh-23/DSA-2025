public class Insertion extends Quicksorting{
    public static void main(String[] args) {
        int[] arr = {5,4,10,1,6,2};
        printNewArray(arr);
        System.out.println();

        for (int i = 1 ; i<arr.length; i++){
            int temp=arr[i];
            int j=0;
            for (j =i-1;j >=0;j--){
                if(arr[j]> temp){
                    arr[j+1]=arr[j];
                }
                else{
                    break;
                }

            }
            arr[j+1]=temp;

        }
        printNewArray(arr);
    }
}
