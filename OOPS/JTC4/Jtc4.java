//Call by value and reference
class Jtc4{
	public static void main(String[] args) {
		MethodParamService ref= new MethodParamService();
		System.out.println("-----Primitive----");
		int ab= 123;
		System.out.println("In main before calling:\t"+ ab); //123
		ref.modify(ab);//call by value: passes a copy of the int value
		System.out.println("In main after:\t"+ab); //123

		System.out.println("\n\n-----Reference-----");
		User ur= new User();
		ur.uid= 101;
		ur.phone= 8345798125L;
		System.out.println("In main before:\t"+ur.uid+"\t"+ur.phone);
		ref.modify(ur);
		System.out.println("In main after:\t"+ur.uid+"\t"+ur.phone);
		System.out.println("\nIn main before:\t"+ur.uid+"\t"+ur.phone);
		ref.change(ur);
		System.out.println("In main after:\t"+ur.uid+"\t"+ur.phone);


		// to pass the reference, we pass the object of the class in 
		// the place of the actual parameter and the formal parameter 
		// of a class object type has the same reference to each other 
		// that’s why with the help of the formal parameter object of 
		// class any changes will be reflected in both objects formal 
		// and actual objects.

		Myclass obj = new Myclass();
		System.out.println("\n\n-----MyReference-----");
		System.out.println("In main before:\t"+obj.x);
		ref.change(obj);
		System.out.println("In main after:\t"+obj.x);


	}
}

class MethodParamService{
	void modify(int ab){
		System.out.println("modify(int)");
		System.out.println("Before Modifying:\t"+ab);
		ab= ab+1000;
		System.out.println("After modifying:\t"+ab);
	}

	void modify(User user){
		System.out.println("modify(User)");
		System.out.println("Before Modifying:\t"+user.uid+"\t"+user.phone);
		user= new User();
		System.out.println("Before modifying:\t"+user.uid+"\t"+user.phone);
		user.uid= user.uid+ 1000;
		user.phone= 1234567890L;
		System.out.println("After modifying:\t"+user.uid+"\t"+user.phone);	
	}

	void change(User user){
		System.out.println("change(User)");
		System.out.println("Before modifying:\t"+user.uid+"\t"+user.phone);
		user.uid= user.uid+1000;
		user.phone= 1234567890L;
		System.out.println("After modifying data:\t"+user.uid+"\t"+user.phone);
		user= new User();
		user.uid= 33333;
		user.phone= 1234567890L;
		System.out.println("After modifying Ref:\t"+user.uid+"\t"+user.phone);
	}

	void change(Myclass obj){
		System.out.println("change(int)");
		System.out.println("Befor modifying:\t"+obj.x);
		obj.x=obj.x+20;
		System.out.println("After modifying:\t"+obj.x);
	}
}

class User{
	int uid;
	long phone;
}

class Myclass{
	int x=10;
}