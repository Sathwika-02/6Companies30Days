class GfG
 {
	String encode(String str)
	{
	   String s1="";
	   int count=1;
	   int i;
	   for(i=0;i<str.length()-1;i++){
	       if(str.charAt(i)==str.charAt(i+1))
	       count++;
	       else if(str.charAt(i)!=str.charAt(i+1))
	       {
	           s1=s1+str.charAt(i)+count;
	           count=1;
	       }
	   }
	   s1=s1+str.charAt(i)+count;
	   return s1;
          //Your code here
	}
	
 }