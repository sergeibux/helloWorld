import java.util.Scanner;

class Bonjour{
	public static void main(String[] args){
		Scanner name = new Scanner(System.in);
		System.out.println("Hi ! What's your name ? ");
		String strName = name.nextLine();
		System.out.println("Hello Mister " + strName + " :)");
	}
}
