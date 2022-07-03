package math;

public class _09_PalindromeNumber {

  //O(log10_X)
  public static boolean isPalindrome(int x) {
		 if(x<=0||(x!=0&&x%10==0)) {return false;}
		 int sum=0;
		 while(x>sum) {
			 sum=sum*10+x%10;
			//寫這句是為了不要走到外面 sum每次都在增加 x每次都會變少
			//基偶數
			 if(sum==x || sum==x/10)return true;	
			 x=x/10;
		 }
		 return x==sum;
  }	

// force 類似以上
//    public static boolean isPalindrome(int x) {
//    	if(x<0) return false;
//    	long sum=0;
//    	int y=x;
//    	while(y>0) {
//    		sum=sum*10+y%10;
//    		y=y/10;
//    	}
//    	return (int)sum==x;
//    }

// force
//    public boolean isPalindrome(int x) {
//    	boolean flag=true;
//    	String x1=Integer.toString(x);
//    	for (int i = 0; i < x1.length(); i++) {
//    		int j=x1.length()-1-i;	
//			if(i<=j && x1.charAt(i)!=x1.charAt(j) ) {
//				return false;
//			}
//		}
//    	return flag;
//    }
}
