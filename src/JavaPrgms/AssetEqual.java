package JavaPrgms;

public class AssetEqual {

	// check st1 string is present in st string or not
	public static void main(String[] args) {
		String st = "I am god";
		String st1 ="ama";
		
		boolean res = st.contains(st1)?true:false;
		if(res==true) {
			System.out.println(st1+" present in the string "+st);
		}
		else {
			System.out.println(st1+" is not present in the string "+ st);
		}
	}

}
