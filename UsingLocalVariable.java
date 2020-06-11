package lambda;

public class UsingLocalVariable {
	void method(int arg) {
		int localVar = 40;
		
//		localVar = 50;
		
		MyFunctionInterface fi = () -> {
			System.out.println("arg : " + arg);
			System.out.println("localVar : " + localVar);
		};
		fi.dysonMethod();
	}

}
