import java.util.*;
public class switch_case
{
    
	public static void main(String[] args) {
	    switch_case pnb = new switch_case();
	Scanner sc= new Scanner(System.in);
	int ch,r,n;
	System.out.println("enter choice 1 for fibo series 2 for sum of digits");
	ch=sc.nextInt();
	switch(ch){
	    case 1 :pnb.fibo();
	    break;
	     case 2 :
	         System.out.println("enter a no");
	         n=sc.nextInt();
	         r=pnb.sumdigit(n);
	         System.out.println("sum of digit"+r);
	         break;
	   case 3 :
	       System.out.println("wrong input");
	       break;
	       
	        
	}
	
	}
	public void fibo(){
	 int a=0;
	 int b=1;
	 int c,i;
	 System.out.print(a+" ,"+b);
	 for(i=3;i<=15;i++){
	     c=a+b;
	     a=b;
	     b=c;
	     System.out.print(","+c);
	 }
	}
	public int sumdigit(int n){
	    int s=0;
	    int d;
	    while(n>0){
	        d=n%10;
	        s=s+d;
	        n=n/10;
	    }
	    return (s);
	}
}

