class Solution {
    public List<List<String>> Anagrams(String[] string_list) {
        List<List<String>>res=new ArrayList<List<String>>();
        List<String>keyList =new ArrayList<>();
        Map<String, List<String>>map=new HashMap<>();
        for(String str:string_list){
            char chars[]=str.toCharArray();
            Arrays.sort(chars);
            String key=String.valueOf(chars);
            List<String>strlist=new ArrayList<>();
            if(map.containsKey(key)){
                strlist=map.get(key);
            }
            if(!keyList.contains(key)){
                keyList.add(key);
            }
            strlist.add(str);
            map.put(key,strlist);
            }
            for(String key:keyList){
                res.add(map.get(key));
            }
            return res;
        // Code here
    }
}
