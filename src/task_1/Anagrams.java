package task_1;

public class Anagrams {
	public static void main (String args[]){
		String Str = new String("abcd efgh");
		System.out.println(Str.replaceAll("(.*)abcd efgh(.*)","dcba hgfe"));
	}
}
	