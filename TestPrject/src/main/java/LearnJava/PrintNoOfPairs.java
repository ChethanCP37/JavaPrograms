package LearnJava;

import java.io.*;

public class PrintNoOfPairs {

	public static void main(String[] args) throws IOException {
		int ar[]= {1,2,5,1,2,3,1,5,1};
		int n=ar.length;

		int count=0;
		int visited=-1;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(ar[i]!=visited && ar[j]!=visited)
				{
					if(ar[i]==ar[j])
					{
						count=count+1;
						ar[i]=visited;
						ar[j]=visited;
					}
				}

			}

		}
		System.out.println(count);

	}
}