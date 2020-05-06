import java.util.Scanner;
/**
 * This is an usefull app
 * @author Merliere Vanhoeke Sébastien
 */

public class BonjourPersonnalise{
/**
 * We know what it does :)
 * <br>oh yes ! we know :D
 */
	public static void main(String[] args){
		System.out.println("Hi ! ");
		String strName = "";
		// don't crash if no arg sended
		if (args.length < 1){
			Scanner name = new Scanner(System.in);
			System.out.println("What's your name ? ");
			strName = name.nextLine();
		} else {
			strName = args[0];
		}
		System.out.println("Hello Mister " + strName + " :)");
	}
}
