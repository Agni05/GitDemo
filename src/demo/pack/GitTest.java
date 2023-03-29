package demo.pack;

public class GitTest {
	
	public int getSum()
	{
		int i = 23;
		int j = 15;
		int sum = i+ j;
		System.out.println(sum);
		return sum;
	}
	
	public int getSub()
	{
		int i = 34;
		int j =37;
		int sub = j - i;
		System.out.println(sub);
		return sub;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GitTest test = new GitTest();
		test.getSum();
		test.getSub();
		KolkataTest kTest = new KolkataTest();
		kTest.getText();
		Multiple multi = new Multiple();
		multi.getMultiple();
	}

}
