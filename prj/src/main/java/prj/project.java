package prj;


public class project {
	public static void main(String args[])
	{
		sweets s1=new sweets("laddu",11);
		sweets s2=new sweets("kovva",10);
		sweets s3=new sweets("barfi",12);
		System.out.println("sweets are: "+s1.name+" "+s2.name+" "+s3.name);
	}
	public String display(candies c[],int l,int m)
	{String s="";
		for(int i=0;i<5;i++)
		{
			if(c[i].weight>=l&& c[i].weight<=m)
			{
			s=s+c[i].name+" ";
			
			}
		}
		return s;
	}

}
