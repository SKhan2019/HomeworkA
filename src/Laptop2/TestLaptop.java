package Laptop2;



public class TestLaptop {
	
	public static void main(String[] agrs) {
		
		Laptop name = new Laptop();
		name.setname("I have a Apple Macbook Pro Laptop");
		name.displayname();
		
		Laptop age = new Laptop("My laptop is" + 6 + " years old");
		
		Laptop usage = new Laptop("I use my laptop for personal work");
		
		Laptop color = new Laptop("My laptop is silver color");
		
		
		Laptop Mac6 = new Laptop();
		Mac6.setLine("I use my laptop to learnt github");
		String Mac6LineBefore = Mac6.getLine();
		System.out.println("Alex says: " + Mac6LineBefore);
		
		Laptop Mac8 = new Laptop();
		Mac8.setLine("I Like My Mac");
		String Mac8Line = Mac8.getLine();
		System.out.println("Khan says: " + Mac8Line);
		
		String Mac6LineAfter = Mac6.getLine();
		System.out.println("Alex says: " + Mac6LineAfter + " too.");
		
		Laptop.MsgAll();
		
	}
		
		
	}

