
public class Array01 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,65};
        for(int i = 0;i<arr.length;i++) { //数组中的length是数组的属性 只要定义了数组 就会有这个length属性
            System.out.println(arr[i]);
        }
        
        for(int i =0;i<args.length;i++) {
            System.out.println(args[i]);//java Array01 abc
        }
    }
}