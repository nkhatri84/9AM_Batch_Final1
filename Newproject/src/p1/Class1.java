package p1;

public class Class1 {
	int a;
	public void abc()
	{
		System.out.println("I am the first method");
		System.out.println("I am the second line");
	}
	public void abc1()
	{
		System.out.println("I am the second method");
		System.out.println("I am the second line");
	}
	public static void main(String[] args) {
		System.out.println("I am the main method");
		Class1 obj=new Class1();
		System.out.println("I am the second line of main method");
		System.out.println(obj.a);
		obj.a=245;
		System.out.println(obj.a);
		obj.abc();
		System.out.println("I am the main method and i m the nitin");
		obj.abc1();
	}
	
	

}
