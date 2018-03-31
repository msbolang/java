/*
 final关键字
final的变量值不能被改变
       final的 成员变量
       final的局部变量（形参）
final的方法不能够被重写
final的类不能够被 继承
 */
public class TestFinal {
    
}

final class T { //类定义了final就不能被继承
    final int i = 8; //变量定义了final 就不能被修改
    public void m(final int j) {
        //j定义了形参为final 只要传进来就不能够被修改
    }
     
    public void cat(final Cat c) {
        //c对象定义Cat类型  并且定义了final 这样传进来的对象只能是Cat对象
    }
}