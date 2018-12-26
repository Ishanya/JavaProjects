
public class FigureDemo {
	public static void main(String z[]) {
	Figure f;
	Triangle t=new Triangle(10, 20);
	Circle c=new Circle(5,6);
	
	f=c;
	System.out.println(f.area());
	
	}
}