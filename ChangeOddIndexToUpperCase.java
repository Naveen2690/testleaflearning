package week1.day2.assignments.mandatory;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Naveen";
		char a[]=s.toCharArray();
		for (int i=0;i<s.length();i++) {
			if (i%2!=0) {
				System.out.print(Character.toUpperCase(a[i])+"\n");
			}
			else {
				System.out.println(a[i]);
			}
		}
	}

}
