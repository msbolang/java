public class  
{
	//byte的储存字节是1字节 表数范围在-128~127之间
	//short的占用内存储存2字节 表数范围 -2的15次方 ~2的15次方-1  正的最高位  32767
    //int的表数范围 -2的31次方~2的31次方-1  正的最高位是2147483647
	//long 占用 储存空间8字节  表数范围 -2的63次方~2的63次方-1   正的最高位9223372036854775807
	public static void main(String[] args) 
	{
		int i=1,j; //对
		float f1=0.1;//错 0.1是duoble类型 
		float f2=123;//对

		long l1=12345678;//对 
		long l2=8888888888;//错 long表述后面需要加L

		double d1=2e2o; //对
		double d2=124; //对

		byte b1=1,b2=2,b3=129; //错 因为 b3超出byte类型的表数范围 byte的储存字节是1字节 表数范围在-128~127之间

		j=j+10; //错 没有声明变量值

		i=i/10; //对 结果是0.1 把i自动转换为double类型  因容量小的数据类型可以自动转换为容量大的数据类型   
		
		i=i*0.1;//对

		char c1='a',c2=125;//对  虽然声明了C2是char类型 又赋值125整型数据 

		byte b=b1-b2; //对

		char c=c1+c2-1; //错 因byte，sthor，char之间不会互相转换，他们三者在计算时首先会转换为int类型 用char声明c就错了

		float f3=f1+f2;//错 因结果是123.1 他是一个duoble类型 用float声明就错了
		float f4=f1+f2*0.1;//错

		double d=d1*i+j;//对

		float f=(float)(d1*5+d2);//对 做了强制转换

		
	}
}
