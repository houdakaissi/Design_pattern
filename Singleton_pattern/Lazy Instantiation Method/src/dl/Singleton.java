package dl;
//Create only one instance in this class 
public class Singleton {
	public static   Singleton singleton  ;
  int i;
	private Singleton() {
		
		System.out.println("start");
	}
 public static Singleton getInstance() {  //we do if null to instanciate only one time for only s not s1.
	 if(singleton==null) {
	 singleton=new Singleton();}
		return singleton;
	}
 
			
		
	

}
