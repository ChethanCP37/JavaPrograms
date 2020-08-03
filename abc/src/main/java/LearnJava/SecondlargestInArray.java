package LearnJava;


public class SecondlargestInArray {
	public static void main(String[] args) {
		int a[]= {18,2,980,14,38,22,9,101};
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		int k=(a.length)-2;
		System.out.println("second largest number in array is "+a[(a.length)-2]);
	}

}
