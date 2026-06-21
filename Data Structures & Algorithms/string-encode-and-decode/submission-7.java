class Solution {

    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();
        for(String str: strs) {
            builder.append(String.format("%03d", str.length()));
            builder.append(str);
        }

        return builder.toString();
    }

    public List<String> decode(String str) {

        ArrayList<String> strs = new ArrayList<>();

        for(int i = 0; i < str.length();) {
            int len = Integer.parseInt(str.substring(i, i + 3));
            i+=3;
            strs.add(str.substring(i, i + len));
            i+=len;
        }

        return strs;
    }
}
