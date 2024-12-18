import org.testng.annotations.Test;

public class InheritChild extends InheritParent{

	@Test
	public void inhtest() {
		
		int a=3;
		Inherit2 inh = new Inherit2(3);
		doThis();
		System.out.println(inh.incrementTest());
		System.out.println(inh.decrementTest());
		//Inherit3 inh3 = new Inherit3(a);
		System.out.println(inh.multiplTwo());
		System.out.println(inh.multiply3());
	}

}
