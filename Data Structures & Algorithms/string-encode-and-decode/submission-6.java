class Solution {

    public String encode(List<String> strs) {
        String enc = "";
        for(String s: strs) {
            String len;
            if(s.length() < 10) len = "00" + s.length();
            else if(s.length() < 100) len = "0" + s.length();
            else len = "" + s.length();
            
            enc += len + "#" + s;
        }

        return enc;
    }

    public List<String> decode(String str) {
        ArrayList<String> dec = new ArrayList<>();
        int i = 0;
        while(i < str.length()) {
            int len = Integer.parseInt(str.substring(i, i+3));
            i += 4;

            dec.add(str.substring(i, i + len));
            i += len;
        }

        return dec;
    }
}
