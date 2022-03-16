import java.util.Scanner;

public class DynamicSizeArray {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the array size:");
		int size = scanner.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter " +size+ " numbers:");
		
		for(int i =0;i<arr.length; i++) {
		arr[i] = scanner.nextInt();
		}
		
		System.out.println("The entered values numbers are: ");
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		

	}

}
