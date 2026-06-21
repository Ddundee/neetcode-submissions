class Solution {

    public String encode(List<String> strs) {
        String encodedStr = "";
        for(String str: strs) {
            String len;
            if(str.length() < 10)
                len = "00" + str.length();
            else if(str.length() < 100)
                len = "0" + str.length();
            else
                len = "" + str.length();

            encodedStr += len + "#" + str;
        }

        return encodedStr;
    }

    public List<String> decode(String str) {
        int i = 0;
        ArrayList<String> decodedStrs = new ArrayList<>();

        while(i < str.length()) {
            int len = Integer.parseInt(str.substring(i, i+3));
            i += 4;

            decodedStrs.add(str.substring(i, i+= len));
            
        }
        return decodedStrs;
    }
}
