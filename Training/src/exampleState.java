
public class exampleState {
private int id;
private String name;
public static String hey;

public exampleState() {
	super();
	id=1223;
	
}

{
	System.out.println("hello there");

}

static {
	System.out.println("hello");
	hey="mine";
}

public exampleState(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}



public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public void display()
{
	System.out.println("Employee Id: "+id);
	System.out.println("Employee Name: "+name);
}

public void sorting(exampleState e[])
{
	for(int i=0;i<(e.length-1);i++)
	{
		for(int j=i+1;j<e.length;j++)
		{
			exampleState t;
		//	System.out.println(i);
			if(e[i].id<e[j].id)
			{
				t=e[i];
				e[i]=e[j];
				e[j]=t;
				//System.out.println(e[i].id);
			}
		}

		
	}
	for(int k=0;k<e.length;k++)
	{
		System.out.println(e[k].id+" "+e[k].name);
	}
	
}
}
