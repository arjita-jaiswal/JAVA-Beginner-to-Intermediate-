import java.util.*;
class Q2{
	public static void main(String args[]) throws Exception{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int ans=0;
		String[] a1=s.split("\\+");
		int l=a1.length;
		int num[];
		num=new int[l];
		for(int i=0;i<l;i++){
			String[] a2=a1[i].split("\\-");
			num[i]=Integer.valueOf(a2[0]);
			for(int j=1;j<a2.length;j++){
				num[i]=num[i]-(Integer.valueOf(a2[j]));
			}
		}
		for(int k=0;k<l;k++){
			ans=ans+num[k];
		}
		System.out.println(ans);
	}
}