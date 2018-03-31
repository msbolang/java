import java.io.*;

/** 递归出目录结构
 * 知识点
 * 1. 对象的.getName();  //获取文件对象的名称
 * 2. 对象的。listFiles()  //文件对象的子目录
 * 3. 对象的。isDirectory() //判断是否目录
 * @author Administrator
 */
public class FileList {
    public static void main(String[] args) {
        File f = new File("D:/java/java/java-study/src/file/A");
        System.out.println(f.getName());
        list(f,1);
    }
    
    public static void list(File o,int e) {
        String k = "";
        for(int i=0;i<e;i++) {
            k +="    ";
        }
        File[] childs = o.listFiles();
        for(int i=0;i<childs.length;i++) {
            System.out.println(k+childs[i].getName());
            if(childs[i].isDirectory()) {
                list(childs[i],e++);
            }
        }
    }
}
