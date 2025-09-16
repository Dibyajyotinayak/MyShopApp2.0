
interface itr2
{
	public abstract void m1();
	public abstract void m2();
} 
abstract class itrl2 implements itr2{

	public void m1(){
		System.out.println("M1-overridden");
	}
}
class itrl3 extends itrl2
{

	public void m2(){
		System.out.println("M2-overridden");
	}

 public static void main(String[] args){ 
	
	 itrl3 l=new itrl3();
	 l.m1();
	 l.m2();
	}
}