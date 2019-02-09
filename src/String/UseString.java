package String;

public class UseString {
	public static void main(String[] args) {
		String s = "I want to learn Github";
		String s2 = "i want to learn github";
		
		
		
		char [] Array = s2.toCharArray();
		System.out.println("1) " +Array.length);
		System.out.println("2) " +Array[7]);
		System.out.println("3) " +s + " and " +s2);
		System.out.println("4) " +s.compareTo(s2));
		System.out.println("5) " +s.compareToIgnoreCase(s2));
		System.out.println("6) " +s2.endsWith("github"));
		System.out.println("7) " +s.indexOf(s2));
		System.out.println("8) " +s2.valueOf(true));
		System.out.println("9) " +s2.substring(3));
		System.out.println("10) " +s.codePointAt(8));
		System.out.println("11) " +s.concat("programming"));
		System.out.println("12) " +s.equalsIgnoreCase("Github lrarn to wanr I"));
		System.out.println("13) " +s.equalsIgnoreCase("I want to learn Github"));
		System.out.println("14) " +"1) " +s.replace('G','L'));
		System.out.println("15) " +s.trim() + "l");
		System.out.println("16) " +s.contains("want"));
		System.out.println("17) " +s.contains("USA"));
		System.out.println("18) " +s2.equalsIgnoreCase(s));
		System.out.println("19) " +s2.equals(s));
		System.out.println("20) " +s.toUpperCase());
		System.out.println("21) " +s.toLowerCase());
		System.out.println("22) " +s.length());
		System.out.println("23) " +s.hashCode());
		System.out.println("24) " +s.getClass());
		System.out.println("25) " +s.CASE_INSENSITIVE_ORDER);
		System.out.println("26) " +s.contentEquals(s));
		System.out.println("27) " +s.contains(s));
		System.out.println("28) " +s.intern());
		System.out.println("29) " +s.charAt(5));
		System.out.println("30) " +s2.isEmpty());

		
	} 
	}
