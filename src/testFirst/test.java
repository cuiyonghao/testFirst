package testFirst;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.*;


@RunWith(Parameterized.class)
public class test {
	private int input1;
	private int input2;
	private int input3;
	private int expected;
	private triangle tri = null;
	
	public test(int input1,int input2, int input3,int expected){
		this.input1 = input1;
		this.input2 = input2;
		this.input3 = input3;
		this.expected = expected;
	}
	@Before
	public void setUp(){
		tri = new triangle();
	}
	@Parameters
	public static Collection<Object[]>getData(){
			return Arrays.asList(new Object[][]{
				{1,1,1,1},
				{2,2,3,2},
				{2,3,4,0},
				{1,1,2,-1}
			});
		
	}
	@Test
	public void testAdd(){
		assertEquals(this.expected,tri.triangletest(input1,input2,input3));
	}
}
