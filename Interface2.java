
public interface Interface2 {
 void method1();
 default void method3()
 {
	System.out.println("In default interface2"); 
	
 }
}
