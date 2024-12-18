import org.testng.annotations.Test;

public class Inherit2 extends Inherit3{
	int a; //class variable
	public Inherit2(int a) { //parameterized constructor
		// TODO Auto-generated constructor stub
		super(a);
		this.a=a;  //instance variable
	}

	@Test
	
	public int incrementTest() {
		
		a=a+1;
		return a;
	}
	
public int decrementTest() {
		
		a=a-1;
		return a;
	}

}
