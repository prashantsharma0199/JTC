//Example using method parameter

class Jtc1{
	public static void main(String[] args) {
		MethodService serv= new MethodService();
		serv.show('A'); //65->ASCII value of A

		byte by1= 123;
		serv.show(by1); //123 
		// serv.show(123L);//Compilation error due to incompatible types
		serv.show((int)123L);//123-> no error due to type casting
		// serv.display(123);//by default it's and integer literal
		serv.display((byte)123);//123-> typecasting to byte
		serv.display(by1);//123-> defined as byte
	}
}

class MethodService{
	void show(int ab){
		System.out.println("-show(int) \t:"+ab);
	}

	void display(byte by1){
		System.out.println("-display(byte) \t:"+ by1);
	}
}