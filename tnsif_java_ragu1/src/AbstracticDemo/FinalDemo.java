package AbstracticDemo;

final class FinalDemo {

		private static final String Max = null;
		final int var = 100;
		private int Var;
		final void display() {
			System.out.println("show the value of max: "+Max);
			
		}
		public static void main(String[] args) {
			FinalDemo fd = new FinalDemo();
			fd.display();
			fd.Var = 100;
		}
	}

