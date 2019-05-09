package JavaPrgms;

public class DuplicateNumInArray {
	public static void main(String[] args) {

		int [] arr1={22,5,13,12,32,7,8,3,2,17};
		int [] arr2={20,51,1,12,2,17,28,13,2,7,5,23,9};
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					System.out.println("Common elements are:"+arr1[i]);


				}
			} 
			
		}
	}
}
