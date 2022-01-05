class Solution{
    static String printMinNumberForPattern(String S){
        Stack<Integer>st=new Stack<>();
        int num=1;
        String ss="";
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            if(ch=='D'){
                st.push(num);
                num++;
            }
            else{
                st.push(num);
                num++;
                while(st.size()>0){
                 ss+=String.valueOf(st.pop());
                
                }
            }
        }
        while(st.size()>0){
                 ss+=String.valueOf(st.pop());
        }
        return ss;
       
        
        
        // code here
    }
}
