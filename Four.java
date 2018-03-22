import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input 5 numbers");

		int [] numlist = new int[5];
		
		for(int i=0; i<numlist.length; i++) {
			
			numlist[i] = scanner.nextInt();
		}

		System.out.println(numlist[4]);

		scanner.close();
	}


	}


