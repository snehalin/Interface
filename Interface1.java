
public interface Interface1 {
 int a=60;//p s final
 void method1();//p abstract
 public abstract void method2();
 //void method6();
 
 default void method3()
 {
	System.out.println("In default interface1 "); 
	//method5();
 }
 
 public static void method4()
 {
	 System.out.println("In p s method4");
 }
 
/* private static void method5()   //9 version 
 {
	System.out.println("In p s method5"); 
 }*/
 
}
