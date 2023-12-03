package dp;

public class ThreadedTask extends Thread {
private String taskName;

public ThreadedTask(String taskName) {
	 
	this.taskName = taskName;
}
@Override
public void run() {
	Singleton s=  Singleton.getInstance();  //instancier seul fois start .... et peut Sing..) etre pub ou pri
	// Singleton s=new Singleton();  instancier a chaque etape et Singleton() doit etre public
	s.traiter(taskName);   //ca et traiter de app vont aller au traiter en meme temps
}




}
