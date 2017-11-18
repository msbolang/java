//扑住异常基本写法
public class Test_TryCatch_01 {
    public static void main(String[] agrs) {
       int[] arr = {1,2,3};
       try {
        System.out.println(arr[4]);
       }catch(ArrayIndexOutOfBoundsException e) {
           System.out.println("程序出错了~");
           e.printStackTrace();//打印出异常信息
       }
    }
}
