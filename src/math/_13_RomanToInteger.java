package math;

//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000
	

public class _13_RomanToInteger {
	public static void main(String[] args) {
		System.out.println("III".charAt(0)=='I');
//		romanToInt("III");
	}
	
	//從右向左掃
//    public static int romanToInt(String s) {
//    	int sum=map(s.charAt(s.length()-1));
//		for (int i = s.length()-2; i >=0 ; i--) {	//初始值上面已給所以這裡從倒數第2位開始
//			if(map(s.charAt(i))<map(s.charAt(i+1))){
//				sum=sum-map(s.charAt(i));
//			}else {
//				sum=sum+map(s.charAt(i));
//			}
//		}
//		return sum;
//    	
//    }
	//從左向右掃
//    public static int romanToInt(String s) {
//
//		int sum=0;
//		for (int i = 0; i < s.length(); i++) {
//			if(i>0 && map(s.charAt(i-1)) < map(s.charAt(i))) {	//掃到的數字>前一個
//				sum=sum+( map(s.charAt(i))-(map(s.charAt(i-1))*2) );
//			}else {
//				sum=sum+map(s.charAt(i));
//			}
//		}
//		return sum;
//        
//    }
	
	
//	I can be placed before V (5) and X (10) to make 4 and 9. 
//	X can be placed before L (50) and C (100) to make 40 and 90. 
//	C can be placed before D (500) and M (1000) to make 400 and 900.
	
	//force
    public static int romanToInt(String s) {
		int sum=0;
		int len=s.length();
		for (int i = 0; i < len; i++) {
			if(s.charAt(i)=='I') {
				if(i+1<len) {
					if(s.charAt(i+1)=='V') {
						sum=sum+9;
						i++;
					}
					if(s.charAt(i+1)=='X') {
						sum=sum+4;
						i++;
					}else {
						sum=sum+map(s.charAt(i));
					}
				}else {
					sum=sum+map(s.charAt(i));
				}
			}
//			......
		}
		return sum;
    	
    }

    private static int map(char c) {
    	switch (c) {
		case 'I':return 1;
		case 'V':return 5;
		case 'X':return 10;
		case 'L':return 50;
		case 'C':return 100;
		case 'D':return 500; 
		case 'M':return 1000;
		default :return 0;
    	}
    }
}
