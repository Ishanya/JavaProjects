
public class Triangle extends Figure{
	
	Triangle(int a, int b) {
		super(a, b);
	}

	@Override
	public float area() {
		// TODO Auto-generated method stub
		 float cal=(length*width)/2;
		 return cal;
		
	}
}
