import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Forloopexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 int[] a = {1,2,6,10,40,42,45,76,43,87};
		 for(int i =0;i<a.length;i++) {
			 if(a[i] % 2 ==0){
				 System.out.println(a[i]);
				 break;
			 }
			 else {
				 System.out.println("not a multiple of 2");
			 }
		 }
		 
		 ArrayList<String> al = new ArrayList<String>();
		 al.add("al");
		 al.add("test");
		 al.add("removetest");
		 al.add("tews");
		 al.add("gfgd");
		 al.remove(1);
		 al.get(0);
		 System.out.println(al.get(3));
		 
		 for(String sla :al) {
			 System.out.println(sla);
		 	 
	}
		 System.out.println(al.contains("al"));
   String[] name = {"new1","new2","new3"};// normal String Array
   List<String> newArrayList = Arrays.asList(name);// converting String array to ArrayList
   newArrayList.add("testfromlist");
   
 /* for(String s3 : newArrayList) {
	  
	  System.out.println(s3);
  }*/
}
}
