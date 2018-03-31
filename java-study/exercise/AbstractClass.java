/*
用abstract关键字修饰的类 是抽象类 用abstract来修饰一个方法时 该方法叫做抽象方法
含有抽象方法的类必须被声明为抽象类，抽象类必须被继承，抽象方法必须被重写
抽象类不能被实列化
抽象方法只需声明，而不需要实现 （需要在子类里面实现） 谁继承谁实现
自己的理解，abstract定义的抽象方法就是用来被重写的，重写以后可以方便实现多态
*/


abstract class Animal2 {//含有抽象方法的类必须被声明为抽象类，抽象类必须被继承，抽象方法必须被重写
    private String name;
    Animal2(String name){
    this.name = name;
    };
    
    public abstract void enjoy();//由子类去重写这个抽象方法
    
}

class Dog2 extends Animal2 {
    private String eyesColor;
    Dog2(String n,String c){
        super(n);
        eyesColor = c;
    };
    public void enjoy() {
        System.out.println("狗的叫声 实现了重写抽象类enjoy");
    }
}

class Cat2 extends Animal2 {
    private String furColor;
    Cat2(String s,String c) {
        super(s);
        this.furColor = c;
    }
    public void enjoy() {
        System.out.println("猫的叫声 实现了重写抽象类enjoy");
    }
}

//扩展一只鸟
class Bird2 extends Animal2 {
    private String furColor;
    Bird2(String s,String c) {
        super(s);
        this.furColor = c;
    }
    public void enjoy() {
        System.out.println("鸟的叫声 实现了重写抽象类enjoy");
    }
}

//有个小女孩 她有一只Animal2类型的宠物 
class Lady2 {
    private String name;
    Animal2 pet;
    Lady2(String n,Animal2 c) {
        this.name = n;
        this.pet = c;
    }
    //小女孩的宠物高兴了调用pet的enjoy  pet宠物是引用了Animal2
    public void myPetEnjoy() {
        pet.enjoy();//多态的精髓  在运行的过程中动态绑定  而非编译的过程中绑定
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Cat2 c = new Cat2("catName","red");
        Dog2 d = new Dog2("dogName","yellow");
        Bird2 b = new Bird2("birdName","block"); //扩展一只鸟
        Lady2 l1 = new Lady2("lili",c);
        Lady2 l2 = new Lady2("luce",d);
          Lady2 l3 = new Lady2("li",b);//扩展一只鸟
        l1.myPetEnjoy();//猫的叫声
        l2.myPetEnjoy();//狗的叫声
        l3.myPetEnjoy();//扩展一只鸟
    }
} 