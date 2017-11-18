//多态的好处是可扩展性强  动态绑定类  试想一下 下面的程序 扩展出一只鸟 是否很方便  
//扩展出一只鸟只需要加一个鸟的类 在void main中new出来就可以了，无需改其他代码
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
    Cat(String s,String c){
        super(s);
        this.furColor = c;
    }
    public void enjoy() {
        System.out.println("猫的叫声");
    }
}

//有个小女孩 她有一只Animal类型的宠物 
class Lady {
    private String name;
    Animal pet;
    Lady(String n,Animal c){
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
        Lady l1 = new Lady("lili",c);
        Lady l2 = new Lady("luce",d);
        l1.myPetEnjoy();//猫的叫声
        l2.myPetEnjoy();//狗的叫声
    }

} 