package testFirst;
public class triangle {
	public int triangletest(int a,int b, int c){
		if(b+c>a && a+b>c && a+c>b)
		{	
			if(a==b && a==c)
			
			{
				return 1;//this is �ȱ�������
			}
			else if(a==b||a==c||b==c)
			{
				return 2;//this is ����������
			}
			else{
				return 0;//this is ��ͨ������
			}
		}
		else{
			return -1;//this is not triangle
		}
	}
}
