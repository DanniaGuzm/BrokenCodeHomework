package Homework;

public class BrokenCodeTwo {
	
		public static void main(String[] args) {
			
		     double tempOne = 84.7;
			 int tempTwo = 66;
			
			
			if (tempOne >= 67 && tempTwo <= 100) {
				System.out.println("tempOne");
				
			} else if ( tempOne >= 67 && tempTwo <= 100) {
				System.out.println("True");
				
			} else {
				System.out.println(" false");
			}
			
			System.out.println("***********************");
			
			
			
			String season = "Monday";

			switch (season) {
			
			case "fall":
				System.out.println("Recovering from hot weather");
				break;
				
			case "winter":
				System.out.println("Toooo cold");			
				 
				
			case "summer":
				System.out.println("Toooo hot");			
				 
			default:
				System.out.println("Season does not exist!");	
			}
			
			System.out.println("****************");
			
			
			for (int i = 0; i <=10; i++) {
				
				if (i == 5) {
					System.out.println("I equals to 5");
					
				} else{
					System.out.println("i not equals");
				}
			}

		}
}

