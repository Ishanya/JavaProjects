
public class Circle extends Figure{

	Circle(int a, int b) {
		super(a, b);
		
	}
	
	@Override
	public float area() {
		// TODO Auto-generated method stub
		float cal=(float) (2*(3.14)*length);
		return cal;
		
	}
	

}
