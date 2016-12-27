package Protect;

  public class Exampl {
	
	protected  static void print(){
		       //This works only if the  protected method is declared as static , 
		           //So that way the method will be invoked from the class in differnt package say here Assignmen4_1 class
		         //If this method not defined as static gives error in the class in differnt package
		
		System.out.println("This is protected method in a package");
		
	}

}
