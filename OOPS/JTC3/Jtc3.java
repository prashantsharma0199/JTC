//Invoking Overloaded Methods
class Jtc3{
	public static void main(String[] args) {
		byte by1= 123;
		
		OverloadManager mngr= new OverloadManager();
		
		mngr.show(12, by1); //int, byte
		mngr.show(by1, 12); //byte, int
		// mngr.show(by1, by1); //Compilation error (incompatible types)
		mngr.show((int)by1, by1); //int, byte
		mngr.show(by1, (int)by1); //byte, int

		String str= null;
		Object obj= null;
		int arr[]= null;

		mngr.display(str); //string
		mngr.display(obj); //object
		mngr.display(arr); //object (an array is an object in java)
		mngr.display(null);//string 
		
		mngr.showValues(arr); //int[]
		mngr.showValues(str); //string
		// mngr.showValues(null); //Compilation error(reference is ambiguous)
		mngr.showValues((String)null); //string
		mngr.showValues((int[])null); //int[]
	}
}

class OverloadManager{
	void show(int ab, byte b1){
		System.out.println("show(int, byte)");
	}

	void show(byte b1, int ab){
		System.out.println("show(byte, int)");
	}

	void display(String str){
		System.out.println("display(String)");
	}

	void display(Object obj){
		System.out.println("display(Object)");
	}

	void showValues(String str){
		System.out.println("showValues(str)");
	}

	void showValues(int[] arr){
		System.out.println("showValues(int[])");
	}

}