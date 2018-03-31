
// 排序选择算法 01 
//说明 ： 从java 执行程序传入arge 6 9 5 4 8 2 3 1 7 自动进行从小到大排序
//java Sort_01  6 9 5 4 8 2 3 1 7 
public class Sort_01 {
    public static void main(String[] args) {
       // int req_01 = Integer.parseInt(args[0]); //将第一个参数转换为int类型
       //把参数转换为int类型
       int[] a = new int[args.length];
       for(int i =0;i<args.length;i++) {
           a[i] = Integer.parseInt(args[i]);//使用Integer.parseInt把字符串参数转换为int类型
       }
//       p(a);
//       a = s(a); 
//       p(a);
       //升级版 
       p(a);
       a = s2(a); 
       p(a);
    }
    
    //普通数字交换选择算法 输出 1 2 3 4 5 6 7 8 9
    public static int[] s(int[] args) {
          for(int i = 0;i<args.length;i++) {
            for(int j = 0;j<args.length;j++) {
                if ( args[i] < args[j] ) {
                   int tmp = args[i];
                   args[i] = args[j];
                   args[j] = tmp;
                }
            }
        }
       return args;
    }
    
    //s2 升级版 算法
    /*
    比如：
     6 9 5 4 8 2 3 1 7 
     6 9 5 4 8 2 3 1 7  
    k+1 相等于
    第一次比较是 上面的6和下面的9（k+1）比较
    第二次比较是 上面的9和下面的5比较 5比9小 5的位置 就好9交换 依次类推
    */
    public static int[] s2(int[] args) {
          int k,temp;
          for(int i = 0;i<args.length;i++) {
              k = i;
            for(int j = k+1;j<args.length;j++) {
                if ( args[j] < args[k] ) {
                    k = j;
                }
            }
            if(k != i) {
                temp = args[i];
                args[i] = args[k];
                args[k] = temp;
            }
        }
       return args;
    }
    
    public static void p(int[] args) {
        for(int i=0;i<args.length;i++) {
            System.out.print(args[i]+" ");
        }
        System.out.println(" ");
    }
}