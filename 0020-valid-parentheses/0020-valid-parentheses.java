class Solution {
    public boolean isValid(String s) {
        char[] str = s.toCharArray();
        List<Character> stack = new ArrayList<Character>();
        for(char c : str){
            if(c=='('||c=='{'||c=='['){
                stack.add(c);
            } else {
                if(stack.size()==0) return false;
                if(c==')'&&stack.get(stack.size()-1)!='(') return false;
                if(c=='}'&&stack.get(stack.size()-1)!='{') return false;
                if(c==']'&&stack.get(stack.size()-1)!='[') return false;
                stack.remove(stack.size()-1);
            }
        }
        if(stack.size()!=0) return false;
        return true;
    }
}