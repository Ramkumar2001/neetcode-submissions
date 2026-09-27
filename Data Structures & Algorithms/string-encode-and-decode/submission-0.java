class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        strs.forEach(str -> {
            int length = str.length();
            sb.append(length).append("|").append(str);
        });
        return sb.toString();
    }

    public List<String> decode(String str) {
        int i = 0;
        List<String> sol = new ArrayList<>();
        while (i < str.length()){
            StringBuilder sb = new StringBuilder();
            while(str.charAt(i) != '|'){
                sb.append(str.charAt(i));
                i += 1;
            }
            int length = Integer.valueOf(sb.toString());
            sol.add(str.substring(i + 1, i + 1 + length));
            i += length + 1;
        }
        return sol;
    }
}
