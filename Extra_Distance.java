import java.util.Scanner;
public class Extra_Distance{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter coordinates of d1 : ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		System.out.print("Enter coordinates of d2 : ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		Distance d1 = new Distance(x1,y1);
		Distance d2 = new Distance(x2,y2);
		System.out.println("Distance = "+Distance.formula(x2-x1,y2-y1));
	}
}
class Distance{
	double x;
	double y;
	static double dist;
	Distance(double x,double y)
	{
		this.x = x;
		this.y = y;
		this.dist = dist;
	}
	public static double formula(double x,double y)
	{
		double dist = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
		return dist;
	}
}
