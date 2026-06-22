class Solution {
    public boolean isValid(String s) {
        if(s.isEmpty()){
            return true;
        }
        char first = s.charAt(0);
        char last = s.charAt(s.length() - 1);
        if(first == '{' && last == '}' ||
           first == '[' && last == ']' ||
           first == '(' && last == ')' ){
            return isValid(s.substring(1, s.length() - 1));
           }
           return false;
    }
}
