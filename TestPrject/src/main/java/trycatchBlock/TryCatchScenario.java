package trycatchBlock;

public class TryCatchScenario {
	int a;
	public TryCatchScenario(int a) {
		this.a=a;
	}
	public int add()
	{
		a=a+10;
		try 
		{
			a=a+10;
			try 
			{
				a=a*10;
				throw new Exception();
			}
			catch(Exception e) {
				a=a-10;
			}
		}
		catch(Exception e) {
			a=a-10;
		}
		return a;
	}

	public static void main(String[] args) 
	{
		TryCatchScenario tr = new TryCatchScenario(10);
		int result=tr.add();
		System.out.println(result);

	}

}
