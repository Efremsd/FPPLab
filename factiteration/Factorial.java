package factiteration;

public class Factorial {
public static void main(String[] args) {
	System.out.println(fact(5));
	System.out.println(factRec(6));
}

public static int fact(int n) {
int	fact=1;
	for(int i=2; i<=n; i++) {
		fact*=i;
	}
	return fact;
}
public static int factRec(int n) {
	if(n==0|| n==1) return 1;
	return n*factRec(n-1);
}
public static String reverse(String s) {
	
	if(s==null || s.length()==0) return s;
	String result=""+s.charAt(0);
	return s.substring(1) +result;
	
	
}

}
