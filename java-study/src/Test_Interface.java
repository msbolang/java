/*接口
多个无关的类可以实现同一个接口
一个类可以实现多个无关的接口
与继承关系类似，接口与实现类之间存在多态性

接口 interface是抽象方法和常量值的定义的集合
从本质上讲，接口是一种特殊的抽象类，这种抽象类中包含常量和方法的定义，而不需要实现变量和方法。 由implements声明的子类去实现 （类似继承）
接口定义举列
public interface Runner {
    public static final int id = 1; //在接口里面 所有的变量都是final修饰的 写不写 final都可以
    public void  start();
    public void run();
    public void stop();
}

接口可以多重实现；
接口中声明的属性默认为 public static final的； 也只能是public static final的
接口中只能定义抽象方法，而且这些方法默认为public的也只能说public的
接口可以 继承其他的接口，并且添加新的 属性和抽象方法。
 */



//实列1 
/*说明
定义一个接口 会唱歌的singer 他里面有唱歌方法sing  和睡觉方法 sleep
定义一个学生类去实现（implements） singer接口 并且添加自己的 方法和属性
*/
//定义singer接口

//其他说明： 类和类之间可以相互继承  接口和接口之间也可以相互继承 
// class A extends B implements C,D {}  还可以这样声明，  A 类继承B类 并且实现C和D接口
interface Singer {
    public void sing();
    public void sleep();
}

//定义student学生类实现singer接口
class Student implements Singer {
    private String name; //添加自己的属性
    public String getName() { //添加自己的方法
        return this.name;
    }
    public void sing() { //实现singer接口的sing方法
        System.out.println("学生在唱歌");
    }
    public void sleep() {//实现singer接口的sleep方法
        System.out.println("学生在睡觉");
    }
}

//实列2
/*
    定义一个teaching教学接口 有 老师teacher去实现这个接口 并且老师还要实现singer接口
*/
interface Teaching {
    public void teachMathematics();
    public void teachEnght();
}

//Teacher 实现Teaching和Singer接口
class Teacher implements Singer,Teaching {
    private String name;//老师也有自己的名字
    public void eag() { //老师有自己的方法
    
    }
    public void sing() { //老师实现了Singer接口的sing方法
        System.out.println("老师唱歌");
    }
    public void sleep() {//老师实现了Singer接口的sleep方法
        System.out.println("老师也要休息");
    }
    public void teachMathematics() {//老师实现了Teaching接口的teachMathematice方法
        System.out.println("老师教学生数学");
    }
    public void teachEnght() {//老师实现了Teaching接口的teachEnght方法
        System.out.println("老师 教学生英语");
    }
}

//用多态实现
class  Doing {
    Singer S;
    Teacher T;
    public Doing(Singer s) {
        System.out.println("new了Singer");
        this.S = s;
    }
    public Doing(Teacher t) {
        System.out.println("new了Teacher");
        this.T = t;
    } 
       
    public void sing() {
        T.sing();
    }
    public void sleep() {
        S.sleep();
    }
    
    public void tEnght() {
        T.teachEnght();
    }
    public void tMathematics() {
        T.teachMathematics();
    }
}

public class Test_Interface { //动态绑定
    public static void main(String[] args) {
          Student s = new Student();
//          s.sing();
//          s.sleep();
          
          Teacher t = new Teacher();
//          t.sing();
//          t.sleep();
//          t.teachMathematics();
//          t.teachEnght();
          
          
          //用多态去 实现
     
          Doing d1 = new Doing(s);//实现多态的条件
//          d1.sing();
        //  d1.tEnght();//报错 d1传入的学生 类的s 学生类没有实现Teaching接口 所以没有tEnght方法 编译时不会报错 运行时就报错
          Doing d2 = new Doing(t);
        //  d2.sing(); //报错 因为Doing里面没有写techer的sing调用 怎样实现？
        //  Doing d22 = (Student) d2; //怎样强制转换？？？？？？
//          d2.tEnght();//传入的是Teacher类的 t   Teacher类实现了Teaching接口 拥有tEnght方法
//          d2.tMathematics();
     
    }
  
}






