
//乘法口诀打印算法 1
public class Multiplication 
{
	public static void main(String[] args) 
	{
		for(int j=1;j<=9;j++) {
			for(int i=1;i<=9;i++) {
				if(i==j){
					System.out.println(i+"*"+j+"="+(int)(j*i));
				    break;
				}else{
					System.out.print(i+"*"+j+"="+(int)(j*i)+"  ");
				}
				
			}
		}

	}


}
