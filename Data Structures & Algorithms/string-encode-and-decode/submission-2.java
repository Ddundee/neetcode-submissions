class Solution {

    public String encode(List<String> strs) {
        if(strs.size() == 0) return "";
        return String.join(".,123", strs);
    }

    public List<String> decode(String str) {
        // if(str.length() == 0) return new ArrayList<>();
        return Arrays.asList(str.split(".,123"));
    }
}
