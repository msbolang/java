//多态的好处是可扩展性强  动态绑定类  试想一下 下面的程序 扩展出一只鸟 是否很方便  
//扩展出一只鸟只需要加一个鸟的类 在void main中new出来就可以了，无需改其他代码
//多态有三个必要条件
//1. 要有基础
//2. 要有重写
//3. 父类引用调用子类对象

class Animal {
    private String name;
    Animal(String name){
    this.name = name;
    };
    
    public void enjoy() {
       System.out.println("动物的叫声。。。");
    }
}

class Dog extends Animal {
    private String eyesColor;
    Dog(String n,String c){
        super(n);
        eyesColor = c;
    };
    public void enjoy() {
        System.out.println("狗的叫声");
    }
}

class Cat extends Animal {
    private String furColor;
    Cat(String s,String c) {
        super(s);
        this.furColor = c;
    }
    public void enjoy() {
        System.out.println("猫的叫声");
    }
}

//扩展一只鸟
class Bird extends Animal {
    private String furColor;
    Bird(String s,String c) {
        super(s);
        this.furColor = c;
    }
    public void enjoy() {
        System.out.println("鸟的叫声");
    }
}

//有个小女孩 她有一只Animal类型的宠物 
class Lady {
    private String name;
    Animal pet;
    Lady(String n,Animal c) {
        this.name = n;
        this.pet = c;
    }
    //小女孩的宠物高兴了调用pet的enjoy  pet宠物是引用了Animal
    public void myPetEnjoy() {
        pet.enjoy();//多态的精髓  在运行的过程中动态绑定  而非编译的过程中绑定
    }
}

public class Polymorphic {
    public static void main(String[] args) {
        Cat c = new Cat("catName","red");
        Dog d = new Dog("dogName","yellow");
        Bird b = new Bird("birdName","block"); //扩展一只鸟
        Lady l1 = new Lady("lili",c);
        Lady l2 = new Lady("luce",d);
          Lady l3 = new Lady("li",b);//扩展一只鸟
        l1.myPetEnjoy();//猫的叫声
        l2.myPetEnjoy();//狗的叫声
        l3.myPetEnjoy();//扩展一只鸟
    }
} 