
public class searchTest{
	public  static void main(String args[]) {
	String s[]= {"1","2","3"};
		for(int i=0;i<s.length;i++ ) {
			if(s[i].equals("2")) {
				System.out.println(i);
			}else
			{
				System.out.println("Element not found");
			}
		}
	}
}