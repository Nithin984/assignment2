package assignment2.java;

public class bubblesortt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				int[] a= {4,64,7,1,334,54};
				
				for(int i=0;i<a.length;i++)
				{
					for(int j=1;j<a.length-i;j++)
					{
						if(a[j]<a[j-1])
						{
							int tempVar=a[j];
							a[j]=a[j-1];
							a[j-1]=tempVar;
						}
					}
	}
				for(int ele:a) {
					System.out.print(ele+" ");
				}
	}

}
