package Laptop;

public class Laptop   {
	
	public String name;
	public String usage;
	public int num;
	
	public Laptop  () {}
	
	
	public Laptop(String name) {
		this.name = name;
		System.out.println(name);
	}
	public Laptop  (int age) {
		this.num = age;
		System.out.println(age);
	}
	public void setname (String name){
		this.name = name;
	}
		public void displayname() {
		System.out.println(this.name);
	}
		public void usage() {
			System.out.println(usage);
		
		}
}


		
		