package GeneralJavaPrgms;

public class MaxProfitFromStock01 {

	public static void main(String[] args) {
		int maxProfit=0;
		int price[]= {100,180,260,310,40,535,695};

		for(int i=0;i<price.length-1;i++) {
			if(price[i+1]>price[i]) {
				maxProfit = maxProfit+(price[i+1]-price[i]);
			}
		}
		System.out.println("Max profit is "+maxProfit);

	}

}
