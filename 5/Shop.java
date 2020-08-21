import java.util.*;
import java.lang.Exception;
class Items
{
	int itemCode;
	String itemName;
	double unitPrice;
	int stockRemaining;
	int itemLimit;
	public Items(int ic,String in,double up,int sr,int il)
	{
		this.itemCode=ic;
		this.itemName=in;
		this.unitPrice=up;
		this.stockRemaining=sr;
		this.itemLimit=il;
	}
	public String toString()
	{
		return ("Item code: "+itemCode+" Item name: "+itemName+" Price: "+unitPrice+" Stock: "+stockRemaining+" Limit: "+itemLimit);
	}
}class User
{
	String name;
	double budget;
	public User(String name,double budget)
	{
		this.name=name;
		this.budget=budget;
	}
}
class MyException extends Exception
{
	public MyException(String s)
	{
		super(s);
	}
}

public class Shop
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		Items[] a=new Items[4];
		a[0]=new Items(1,"TV",10000,3,2);
		a[1]=new Items(2,"Mouse",1000,7,3);
		a[2]=new Items(3,"HeadPhone",2000,1,6);
		a[3]=new Items(4,"Mobile",5000,5,1);
		User user1=new User("Arjita",2000);
		while(true){
		System.out.println("Enter option: ");
		int option=sc.nextInt();
		
		if(option== 1){
				System.out.println(a[0]);
				System.out.println(a[1]);
				System.out.println(a[2]);
				System.out.println(a[3]);
				
		}
		else if(option== 2){
				System.out.println("Enter item code and quantity: ");
					int code=sc.nextInt();
					int q=sc.nextInt();

				try{
					if((code>4) && (code<1))
					{
						throw new MyException("Item not found!");
					}
					if(((a[code-1].unitPrice)*q)>user1.budget)
					{
						throw new MyException("Over budget!");
					}
					if((a[code-1].itemLimit)<q)
					{
						throw new MyException("Item limit exceed!");
					}
					if((a[code-1].stockRemaining)<q)
					{
						throw new MyException("Out of stock!");
					}
					
					a[code-1].stockRemaining=a[code-1].stockRemaining-q;
					user1.budget=user1.budget-((a[code-1].unitPrice)*q);
					System.out.println("Remaining budget : "+user1.budget);
				}
				catch(MyException e)
				{
					System.out.println(e.getMessage());
				}
				}
			else if(option== 3){
				System.out.println("Thank You!!");
				break;
				
			}
		}
	}
}