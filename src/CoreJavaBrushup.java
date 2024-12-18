
public class CoreJavaBrushup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num='5';
		char c = 'a';
		double decm = 9.087;
		boolean flag = true;
		String s = "test string";
		System.out.println(num + ","+c+","+decm+","+flag+","+s);
		//int Array
		int a[] = new int[5];
		a[0]=5;
		a[1]=6;
		a[2]=7;
		a[3]=17;
		a[4]=52;
		
		int arr[] = {1,2,3,4,5};
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	
		for(int ar : a) {
			System.out.println(ar);
		}
	//string array
	 String[] name = {"Balu","charmi","Arush"};
	
	for(int i=0;i<name.length;i++) {
		System.out.println(name[i]);
	}
	
	for(String sn:name)
		System.out.println(sn);
	}

}