package Functional;

public record GreetingDemo() {
	
		public static void main(String[] args) {
			GreetingDemo gd = () ->
			System.out.println("Hello Everyone, Welcome to the Java Session");
			gd.greet();
			
			

		}

		private void greet() {
			// TODO Auto-generated method stub
			
		}

	}
