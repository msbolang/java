
/**
 *字符串切割 定义一个值为String类型的数组，把字符串s用；切割
 * 使用Doble的包装类parseDouble把字符串转换成doble类型保存到数组
 * @author Administrator
 */
 public class ArrayParser {

    public static void main(String [] args) {
        double[][] d;//定义double类型的二维数组
        String s = "1,2;3,4;5,6;7,8";
        String[] sFirst = s.split(";"); //定义一个值为String类型的数组，把字符串s用；切割
        d = new double[sFirst.length][];//new
        for(int i=0;i<sFirst.length;i++) {
            String[] sSecond = sFirst[i].split(",");
            d[i] = new double[sSecond.length];
            for(int j=0;j<sSecond.length;j++) {
                d[i][j] = Double.parseDouble(sSecond[j]);// 使用Doble的包装类parseDouble把字符串转换成doble类型保存到数组
            }
        }
        
        for(int i=0;i<d.length;i++) {
            for(int j=0;j<d[i].length;j++) {
                System.out.print(d[i][j]+ " ");
            }
            System.out.println();
        }
    }
    
}
