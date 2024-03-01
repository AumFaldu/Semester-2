package Point;
public class Lab_6_5{
	public static void main(String[] args) 
	{
	ThreeDPoint point = new ThreeDPoint(10,30,25.5);
	System.out.println("Distance between (0,0,0) and (10,30,25.5) = "+point.distance(10,30,25));
}
}
class ThreeDPoint extends MyPoint{
	double z;
	ThreeDPoint()
	{
		this.z = 0;
		this.x = 0;
		this.y = 0;
	}
	ThreeDPoint(int x,int y,int z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public double getz()
	{
		return z;
	}
	public double distance(double x,double y,double z)
	{
        x = this.x - x;
        y = this.y - y;
        z = this.z - z;
		return Math.sqrt(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2));
	}
}