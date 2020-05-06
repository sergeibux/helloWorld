class BonjourPersonnalise{
	public static void main(String[] args){
		System.out.println("Hi ! What's your name ? ");
		if (args.length < 1)
			throw new RuntimeException("args < 1 : " + args.length);
		String strName = args[0];
		System.out.println("Hello Mister " + strName + " :)");
	}
}
