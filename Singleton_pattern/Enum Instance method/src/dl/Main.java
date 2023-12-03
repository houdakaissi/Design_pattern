package dl;

public class Main {
	
public static void main(String[] args) {
 
	result r=result.INSTANCE;
	r.i=5;
	r.show();
	result r1=result.INSTANCE;
	r1.i=6;
	r1.show();
}
}
