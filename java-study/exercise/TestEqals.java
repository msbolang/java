/*
 Eqals 重写 比较两个对象是否相等
 */
public class TestEqals {
    public static void main(String[] args) {
        Cat_eqals c1 = new Cat_eqals(1,2,3);
        Cat_eqals c2 = new Cat_eqals(1,2,3);
        Cat_eqals c3 = new Cat_eqals(1,2,4);
        System.out.println(c1==c2); //false
        System.out.println(c1.equals(c2));//true
        System.out.println(c1.equals(c3));//false
    }
}

class Cat_eqals {    
    int color;
    int height;
    int weight;
    public Cat_eqals(int c,int h, int w){
        this.color = c;
        this.height = h;
        this.weight = w;
    }
    
    public boolean equals(Object obj) {
    if(obj==null) return false;
    else{
        if(obj instanceof Cat_eqals) { //instanceof 类似于js里面的typeof 检查obj对象是否是一个Cat对象
            Cat_eqals c = (Cat_eqals)obj;
            if(c.color == this.color && c.height == this.height && c.weight == this.weight){
                return true;
            }
        }
        return false;
    }
}
}

