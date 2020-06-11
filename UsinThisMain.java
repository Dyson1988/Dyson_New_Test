package lambda;

public class UsinThisMain {
	
	public static void main(String[] args) {
		UsingThis uThis = new UsingThis();
		UsingThis.Inner inner = uThis.new Inner();
		
		inner.method();
		
		
		UsingLocalVariable localVar = new UsingLocalVariable();
		localVar.method(50);
	}

}
