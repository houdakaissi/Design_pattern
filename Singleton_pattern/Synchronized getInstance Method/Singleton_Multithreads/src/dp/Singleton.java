package dp;
//Create only one instance in this class 
public class Singleton {
	private static final Singleton singleton ;
     private int c;
	//method to initi one instance after class is loaded 
    static {
 		singleton=new Singleton();
 	 
 		
 	}
	private Singleton() {
		
		System.out.println("start");
	}
public static Singleton getInstance() {
		return singleton;
	}
//synchronized =the function wait till the previous thread end
	public  synchronized void traiter(String taskName){
		System.out.println("traitement detache"+taskName);
		 for(int i=0;i<=5;i++) {
			++c;
			System.out.println(c);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
			System.out.println("fin de traitement de tache"+taskName+"compteur"+c);	
			
			
			
		
	}

}
