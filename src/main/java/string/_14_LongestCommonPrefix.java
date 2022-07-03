package string;

public class _14_LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
    	String prefix=strs[0];
    	for (int i = 1; i < strs.length; i++) {
			while(!strs[i].startsWith(prefix)) {
				prefix=prefix.substring(0,prefix.length()-1);
			}
		}
    	return prefix;
    }
    //優化版 avge下比上面好 worstcase同上面(比每個字）
    public String longestCommonPrefix2(String[] strs) {
    	//從第一組字串的第一個字開始取prefix
    	for (int j = 0; j < strs[0].length(); j++) {
        	char c=strs[0].charAt(j);
        	//forloop到目前長度等於該遍歷字串長度或遍歷到的字不相同時
            for (int i = 1; i < strs.length; i++) {
            	if(j==strs[i].length() || strs[i].charAt(j)!=c) {
            		return strs[0].substring(0,j);
            	}
            }
		}
    	return strs[0];
    }
	//force
    public String longestCommonPrefixForce(String[] strs) {
    	String res="";
    	//從第一組字串的第一個字開始取prefix
    	for (int j = 0; j < strs[0].length(); j++) {
        	String common=strs[0].substring(j,j+1);
        	boolean flag=true;
        	System.out.print("common:"+common+" ");
        	System.out.println("res:"+res);
        	//對每組字串forloop
            for (int i = 0; i < strs.length; i++) {
            	 if(!strs[i].startsWith(res+common)) {
            		flag=false;
     				return res;
            	 }
            }
			if(flag)res=res+common;
		}
    	return res;
    }
}
