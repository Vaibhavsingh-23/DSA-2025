public class Largest {
    public static void main(String[] args) {


        int arr[] = new int[]{2, 3,2};

        int i =0;

            for (int j = i; j < arr.length; j++) {
                System.out.println(i+"   "+j);
                if (arr[i] < arr[j]) {
                    i = j;
                    System.out.println(".............."+i+"   "+j);
                }
            }
            System.out.println(arr[i]+"  ..............."+ i);


    }
}

//int j = 0;
//        for(int i = j;i <arr.length;i++){
//
//        if(arr[j]>arr[i+1])
//j = i ;
//        }