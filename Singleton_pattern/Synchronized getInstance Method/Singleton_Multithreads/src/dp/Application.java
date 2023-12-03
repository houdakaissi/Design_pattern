package dp;

public class Application {
public static void main(String[] args) {
	for(int i=0;i<=5;i++) {
	/*	Singleton s=  Singleton.getInstance();  //instancier seul fois start .... et peut Sing..) etre pub ou pri
		// Singleton s=new Singleton();  instancier a chaque etape et Singleton() doit etre public
		s.traiter("T"+i);*/
		//same as=
		ThreadedTask t=new ThreadedTask("T"+i);
		t.start();
	}
}
}
