package JavaPrgms;

public class SortingOfNumbers {

	public static void main(String[] args) {
		int a[] = {5,9,1,67,32,23,87,53,9};
		int sizeA = a.length;

		for(int i =0; i<sizeA; i++) {
			for(int j=i+0;j<sizeA;j++) { //here we have to enter j=i+1 not j=1
				if(a[i]>a[j]) 
				{
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<sizeA; i++) {
			System.out.println(a[i]);
		}
	}
}
