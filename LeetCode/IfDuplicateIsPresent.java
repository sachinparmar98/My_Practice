class Solution {
	
    public int firstUniqChar(String s) {
        
	Map <Character ,Integer>m=new HashMap();
	
	for(int i=0;i<s.length();i++)
	{char c=s.charAt(0);
		if(m.containsKey(c))m.put(c,m.get(c)+1);
		else m.put(c,1);
	}
    }
}