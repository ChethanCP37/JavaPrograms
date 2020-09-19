package LearnJava;

public class AddArraysAndSort {

	public static void main(String[] args) {
		int a[]= {14,9,1,61,13};
		int b[]= {3,73,104,41};
		int size=a.length+b.length;
		int res[]= new 	int[size];
		
		for(int i=0;i<a.length;i++) {
			res[i]=a[i];
		}
		int l=0;
		for(int j=(a.length);j<size;j++) {
			res[j]=b[l];
			l++;
		}
		
		
		for(int c=0;c<res.length;c++) {
			for(int d=c+1;d<res.length;d++) {
				if(res[c]<res[d] && c!=d) {
					int temp=res[d];
					res[d]=res[c];
					res[c]=temp;
					
				}
			}
		}
		for(int p=0;p<size;p++) {
			System.out.println(res[p]);
		}

	}

}
