//import java.io.*;
/*
try  :开始捕获程序运行中的Exception
catch:　捕获程序运行中的Exception
throw ：抛出Exception
throws: 方法里面表示要抛出那些exception 
finally　：再try-catch里面始终要运行的语句

异常使用的注意事项：
1）当子类重写父类的带有 throws声明的函数时，其throws声明的异常必须在父类异常的可控范围内。
例如，父类方法throws 的是2个异常，子类就不能throws 3个及以上的异常。父类throws IOException，子类就必须throws IOException或者IOException的子类。
2) Java程序可能是多线程的。每一个线程都是一个独立的执行流，独立的函数调用栈。那么，Java中的异常是线程独立的，线程的问题应该由线程自己来解决，而不要委托到外部，也不会直接影响到其它线程的执行。
3）不要在fianlly中使用return。
4）不要在finally中抛出异常。
5）减轻finally的任务，不要在finally中做一些其它的事情，finally块仅仅用来释放资源是最合适的。
6）将尽量将所有的return写在函数的最后面，而不是try … catch … finally中。

纠正：try catch 就是扑捉异常让程序继续执行的
*/
//扑住异常基本写法
//重点注意：：凡是在JDK里面看到定义的系统方法后面带有throws的 必须要进行扑住异常处理 IOException必须要扑住（不扑住不能通过编译）， 而runtimeException可以不用扑住（不扑住运行是会出错，可以通过编译）
class SomeException extends Exception{
    private int id;
    SomeException(int id){
        super();
        this.id = id;
    }
}

 public class Test_TryCatch_throw_01 {
	public static void main(String[] args) {
            try {
	        new Test_TryCatch_throw_01().moon(0);
            } catch(SomeException e){ //先抓小的  moon方法里面 throws抛出来的是SomeException自定义异常 所以这里需要用SomeException匹配 用其他的匹配不到
               System.out.println("扑住小的异常 runtimeException的子类异常");
               e.printStackTrace();//打印异常栈内存信息 详细信息
            } catch(Exception e){  //再抓大的
//               e.getMessage();
               System.out.println("扑住所有异常 包含IOException 和 runtimeException异常");
                       e.printStackTrace();//打印异常栈内存信息 详细信息
            } finally {
                //必须要执行的代码 是否扑住到都会执行这里的代码 
                //finally块仅仅用来释放资源是最合适的
                System.out.println("执行了finally里面的代码");
            }
         }
	public void moon(int m) throws SomeException {
		if(m==0)
		throw new SomeException(2);
	}	
}

