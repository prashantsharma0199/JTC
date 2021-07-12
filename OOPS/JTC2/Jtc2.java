// Example using Method Invocation
class Jtc2{
	public static void main(String[] args) {
		int ab= 98;
		System.out.println("ab in Main Before\t:"+ab);
		Mno ref= new Mno();
		ref.show(ab);
		//No change in the variable ab
		System.out.println("ab in Main After\t:"+ab);
	}
}

class Mno{
	//Pass by value
	//method parameter values are copied to another variable
	//and then the copied object is passed
	
	void show(int ab){
		System.out.println("Before show value\t:" + ab);
		if (ab!= 0) {
			show(ab/10);
		}
		System.out.println("After show value\t:" + ab);
	}
}