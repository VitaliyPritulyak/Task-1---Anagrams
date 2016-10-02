package task_1_1;

public class Anagrams_1 {
	public static void main (String args[]){
		String Str = new String("a1bcd efg!h");
		System.out.println(Str.replaceAll("(.*)a1bcd efg!h(.*)","d1cba hgf!e"));
	}
}
	


