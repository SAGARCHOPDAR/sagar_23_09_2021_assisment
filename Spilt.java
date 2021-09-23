package java_practice;

public class Spilt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String str = "Geekster is my class room";
		
		String[] arr = str.split(" ");
		
		for(int i= arr.length-1; i>=0 ;i--) {
			System.out.print(arr[i]+" ");
		}
	}
}