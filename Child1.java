
public class Child1  implements Interface1 ,Interface2{

	public void method1() {
		System.out.println("In method1");
		
	}
    
	
	@Override
	public void method2() {
		
		System.out.println("In method2 "+a);
	}


	@Override
	public void method3() {
				System.out.println("In method3 child");
	}

}
