package JavaPrgms;

public class ArraySorting {

	public static void main(String[] args) {
		int a[] = {922,3,91,51,8,5473};

		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Sorted Array is ");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		System.out.println("\n2nd largest is "+a[1]);

	}
}