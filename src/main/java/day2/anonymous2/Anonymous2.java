
package day2.anonymous2;

interface Anony 
{
	public void readName();
}

class OuterClass
{
	private String className;
	
	OuterClass(String className)
	{
		this.className=className;
	}
	
	public Anony outerMethod(final String id)
	{
		class AnonyLocal implements Anony{
			public void readName()
			{
				System.out.println("Outer ClassName: "+className);
				System.out.println("Local ID: "+id);
			}	
		}
		return new AnonyLocal() ;
	}
}


class Anonymous2
{	
	public static void main(String[] args)
	{
		OuterClass out=new OuterClass("My Outer Class");
		Anony ano1=out.outerMethod("My First Anonymous Class");
		ano1.readName();
		
		Anony ano2=out.outerMethod("My Second Anonymous Class");
		ano2.readName();
	}
}
