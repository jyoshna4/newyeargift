package prj;

import static org.junit.Assert.*;

import org.junit.Test;

public class testcase {

	@Test
	public void test() {
			project t=new project();
			candies c[]=new candies[5];
			c[0]=new candies("toffee",3);
			 c[1]=new candies("kitkat",6);
			c[2]=new candies("dairymilk",8);
			c[3]=new candies("melody",4);
			c[4]=new candies("lotte",3);
			
			String output=t.display(c,3,5);
			assertEquals("toffee melody lotte ",output);
			
	}

}
