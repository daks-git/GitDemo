
public class Stringexample {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		String s = "dak";
		String s1= "dak" ;//literal method
		
		System.out.println(s+","+s1);
				
				
		String s2= new String("newtest");
		String s3= new String("newtest");
		
		System.out.println(s2+","+s3);
		
		String s4= new String("Dakshayini selenium practice");
		String[] s5  = s4.split("selenium") ;
		System.out.println(s5[0]);
		
		//to print string in reverse
		
		for(int i=s4.length()-1;i>=0;i--) {
			System.out.println(s4.charAt(i));
		}
		
	

	}

}
