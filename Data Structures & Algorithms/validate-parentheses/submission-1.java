class Solution {
    public boolean isValid(String s) {
       if(s.isEmpty()){
        return true;
       }
        if(s.contains("()")){
            return isValid(s.replace("()", ""));
        }
        if(s.contains("{}")){
            return isValid(s.replace("{}", ""));
        }
        if(s.contains("[]")){
            return isValid(s.replace("[]", ""));
        }
       return false;
    }
}
