package lambda;

public class UsingThis {
	public int outterFiled = 10;
	
	class Inner {
		public int innerFiled = 30;
		
		MyFunctionInterface mfi;
		
		void method() {
			
			mfi = () -> { 
				System.out.println(this.innerFiled + UsingThis.this.outterFiled);
			};
			
			mfi.dysonMethod();
		}
		
		
		
	}

}
