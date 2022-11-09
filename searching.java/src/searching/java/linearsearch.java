package searching.java;
import java.util.*;
public class linearsearch {

	public static void main(String[] args) {
   int[] a= {2,3,5,4,7,6,1};
   Scanner s=new Scanner(System.in);
   System.out.println("Enter the required element");
   int key=s.nextInt();

boolean b=false;
for(int i=0;i<a.length;i++) {
	if(key==a[i]) {
		 b=true;
		System.out.println("at the index "+i+" the "+key+" is found");
		break;
	}
}

if(b==false) {
		System.out.println("no such element in the array");
	}
}
	}


