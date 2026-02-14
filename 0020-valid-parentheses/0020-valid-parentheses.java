class Solution {
    public boolean isValid(String s) {
        LinkedList<Character> path = new LinkedList<>();
        for(char c:s.toCharArray()){
            //System.out.println(c);
            if(c == '('){
                path.push(')');
            }else if(c == '['){
                path.push(']');
            }else if(c == '{'){
                path.push('}');
            }

            else if(path.isEmpty() || c != path.pop()){
                return false;
            }
        }
        return path.isEmpty();
    }
}