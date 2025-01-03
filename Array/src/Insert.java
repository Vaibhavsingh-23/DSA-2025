public class Insert {
    public static void main(String[] args) {
    insert();
    }
    public static void insert(){
        Search1 s = new Search1();
        int index = s.search(5);
        System.out.println("Index" + index);

        for (int i = index; i < s.arr.length - 1; i++) {
            s.arr[i] = s.arr[i + 1];
        }
        s.arr[s.arr.length - 1] = 0;
        for (int i : s.arr) {
            System.out.println(i);
        }
    }
}
