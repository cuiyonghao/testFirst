package testFirst;
public class triangle {
	public int triangletest(int a,int b, int c){
		if(b+c>a && a+b>c && a+c>b)
		{	
			if(a==b && a==c)
			
			{
				return 1;//this is 等边三角形
			}
			else if(a==b||a==c||b==c)
			{
				return 2;//this is 等腰三角形
			}
			else{
				return 0;//this is 普通三角形
			}
		}
		else{
			return -1;//this is not triangle
		}
	}
}
