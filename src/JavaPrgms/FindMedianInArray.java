package GeneralJavaPrgms;

public class FindMedianInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]  = {12,56,274,1,67,32,7,98,31,87,101,998};

		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		//Below for loop is to just print the array a after sorting
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" --> "+(i+1));
		}

		if(a.length%2==0) {
			int val = a.length/2;
			float mid = ((float)a[val]+ a[(val-1)])/2;
			System.out.println((float)mid);
		}
		else {

			System.out.println(a[a.length/2]);
		}
	}

}
