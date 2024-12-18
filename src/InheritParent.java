import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class InheritParent {

public void doThis()
{
	
	System.out.println("from parent");
}

@BeforeMethod

public void beforeTest() {
	System.out.println("i will run first");
	
}
@AfterMethod

public void AfterTest() {
	System.out.println("i will run last");
	
}

}
