//Interface is abstract class having all methods abstract.
//syntax
/*
 interface InterfaceName
 {
  public static final datatype var=value ;
public abstract returntype methodname();
 }
 
 
 abstract class Classname
  {
    public static final datatype var=value ;
public abstract returntype methodname();
   } 
   //java version upto 7
   Abstract Class                      Interface 
   1. can not achieve                     we can achieve
    Multiple Inhertance 
   2.can contain non abstract methods,     can not contain
      constructor 
   3.can have instance var                 Can contain only static and final 
    or static or final 
   4.abstract keywords is must for         Not necessary
     abstract methods. 
   5. We can create any type method       By default all methods are public abstract. 
 */
public class interfaceDemo {

	public static void main(String[] args) {
		//Interface1 i1=new Interface1();
		Child1 c1=new Child1();
		c1.method1();
		c1.method2();
        c1.method3();
      //  c1.method4();
        Interface1.method4();
        
        
	}

}
