import java.util.Scanner;

public class Three {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);	

		String [] names = new String[10];
		
		System.out.println("Input 10 words");
		
		for(int i=0; i<names.length; i++) {
			
			names[i] = scanner.nextLine();
		}

		for(int i =0; i<10; i++) {
			System.out.println(names[i]);
		}

		scanner.close();
	}

}


