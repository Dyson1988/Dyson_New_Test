package lambda;

public class LambdaTest {
	public static void main (String[] args) {
//		Runnable r1 = () -> { System.out.println("이것이 람다입니까?"); };
//		r1.run();
//		
//		Runnable r2 = new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
		
//		MyFunctionInterface mfi = (a,b) -> { 
//			
//			System.out.printf("%d + %d = %d \n", a,b, a+b);
//			return a + b;
//			
//			};
//			
//		mfi.dysonMethod(500, 1000);
//		
//		new MyFunctionInterface() {
//			
//
//			@Override
//			public int dysonMethod(int x, int y) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		};
//		
//		mfi = (x, y) -> sum(x, y);
//		System.out.println("1 : " + mfi.dysonMethod(5, 2));
//		
//		mfi = (x, y) -> { return(x + y); };
//		System.out.println("2 : " + mfi.dysonMethod(5, 2));
//		
//		
	}
	
	public static int sum(int x, int y) {
		return (x + y);
	}
	
	

}
