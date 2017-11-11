class  datazh
{
	//修复数据 转换错误
	//byte的储存字节是1字节 表数范围在-128~127之间
	//short的占用内存储存2字节 表数范围 -2的15次方 ~2的15次方-1  正的最高位  32767
    //int的表数范围 -2的31次方~2的31次方-1  正的最高位是2147483647
	//long 占用 储存空间8字节  表数范围 -2的63次方~2的63次方-1   正的最高位9223372036854775807
	public static void main(String[] args) 
	{
		//int i=1,j; //错 j没有值
        int i=1,j=1; //
		//float f1=0.1;//错 0.1是duoble类型  或者写成  f1=0.1f
		float f1=(float)0.1;//修正 把0.1强制转换为float类型
		float f1_0=0.1f; //（修正1）0.1f 声明在内存是4个字节的float
        float f1_1=(float)0.1;//(修正2) 把8个字节的double类型的0.1强制转换为4个字节的float类型
		double f1_2=0.1;//(修正3) 声明为double类型
		
		float f2=123;//对

		long l1=12345678;//对
		
		//long l2=8888888888;//错 long表述后面需要加L
        long l2=8888888888L;//(修正后)

		double d1=2e20; //对 e代表前面的数（2）*10的后面的数的次方  也就是说2e20等于2乘以10的20次方 结果为200000000000000000000
		double d2=124; //对

		//byte b1=1,b2=2,b3=129; //错 因为 b3超出byte类型的表数范围 byte的储存字节是1字节 表数范围在-128~127之间
          byte b1=1,b2=2,b3=127;//(修正后) 
		
        
		j=j+10; //错 没有声明变量值

		i=i/10; //对 结果是0.1 把i自动转换为double类型  因容量小的数据类型可以自动转换为容量大的数据类型   
		
	 //	i=i*0.1;//错 0.1是double类型 转换成int 从高位转换需要强制转换
		i=(int)(i*0.1);
		char c1='a',c2=125;//对  虽然声明了C2是char类型 又赋值125整型数据 

	//	byte b=b1-b2; //错 b1，b2都是byte型，他们相加会先自动转换为int然后相加，相加的结果也是int型的，但是要将一个int型的数字赋给一个byte型的b显然是要强制转换的，
        byte b=(byte)(b1-b2);//修复后

	//	char c=c1+c2-1; //错 因byte，sthor，char之间不会互相转换，他们三者在计算时首先会转换为int类型 用char声明c就错了
        char c=(char)(c1+c2-1);//修复1 前面加强制转换
		int c_1=c1+c2-1;//修复2  声明c是int类型

		//float f3=f1+f2;//错 因结果是123.1 他是一个duoble类型 用float声明就错了
		float f3=(float)(f1+f2);

		//float f4=f1+f2*0.1;//错 因实数运算默认结果是double类型 需强制转换 或声明为double类型
        float f4=(float)(f1+f2*0.1);//修复后 强制转换

        double f44=f1+f2*0.1;//修复后 声明为double类型

		double d=d1*i+j;//对

		float f=(float)(d1*5+d2);//对 做了强制转换

		
	}
}
