public class Lab_7_1{
	public static void main(String[] args) {
		Potato p = new Potato();
		Brinjal b = new Brinjal();
		Tomato t = new Tomato();
		System.out.println(p.toString("Yellow"));
		System.out.println(b.toString("Purple"));
		System.out.println(t.toString("red"));
	}
}
abstract class Vegetable{
	String color;
	abstract public String toString(String color);
}
class Potato extends Vegetable{
	
		public String toString(String color)
		{
			this.color = color;
			return "Potato = "+color;
		}
	
}
class Brinjal extends Vegetable{
	public String toString(String color){
		this.color = color;
		return "Brinjal = "+color; 
	}
}
class Tomato extends Vegetable{
	public String toString(String color){
		this.color = color;
		return "Tomato = "+color;
	}
}