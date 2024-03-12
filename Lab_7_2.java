public class Lab_7_2{
	public static void main(String[] args) {
		B display = new B();
		display.display_P1();
		display.display_P2();
	}
}
interface P1{
	int a=1;
	public void display_P1();
}
interface P2{
	int b=2;
	public void display_P2();
}
class B implements P1,P2{
	public void display_P1()
	{
		System.out.println("Value of a = "+P1.a);
	}
	public void display_P2()
	{
		System.out.println("Value of b = "+P2.b);
	}
}
