package JavaPrgms;

public class AssetEqual {

	public static void main(String[] args) {
		String st = "I am god";
		String st1 ="ama";
		
		boolean res = st.contains(st1)?true:false;
		if(res==true) {
			System.out.println(st1+" present");
		}
		else {
			System.out.println(st1+" Not present in "+ st);
		}
	}

}
