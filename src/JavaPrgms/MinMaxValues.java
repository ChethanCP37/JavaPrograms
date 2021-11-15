package GeneralJavaPrgms;

public class MinMaxValues {

	public static void main(String[] args) {
		int a[]= {45,98,7,12,9,61,872,61};
		int minVal = a[0];
		int maxVal=a[0];
		for(int i=0;i<a.length-1;i++) {
			if(maxVal<a[i+1]) {
				maxVal=a[i+1];
			}
			if(minVal>a[i+1]) {
				minVal=a[i+1];
			}
		}
		System.out.println("Max value "+maxVal+" & min value: "+minVal);
	}
}
