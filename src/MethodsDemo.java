
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo m =new MethodsDemo();
		m.getData();
		System.out.println(m.methodWithRetutnType());
		String sname = m.methodWithRetutnType();
		System.out.println(sname);
		MethodDemo2 m2= new MethodDemo2();
		m2.getDataMethod();
		//System.out.println(getDataDemoStatic());
		getDataDemoStatic();
		
	}
     public void getData() {
    	 System.out.println("Rahul Shetty Academy"); //1
     }
     
     
     public static void getDataDemoStatic() {
    	String s7= "Static method can be directly accessible from the class no need to create method obj for this"; //1
    	System.out .println(s7);
    	//return s7;
     } 
     public String methodWithRetutnType() {
    	String s=  new String("Dakshayini example"); //3,5
    	System.out.println("output from method"); //2,4
    	return s;
     }
	
}
