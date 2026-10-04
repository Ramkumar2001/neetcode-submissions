class Solution {
    public String largestNumber(int[] nums) {
        List<String> stringList = new ArrayList<>();
        for(int n : nums){
            stringList.add(String.valueOf(n));
        }

        stringList.sort((a,b) -> 
             (b+a).compareTo(a+b));
        
        StringBuilder ans = new StringBuilder();
        for(String s: stringList){
            ans.append(s);
        }
        if(ans.charAt(0) == '0') return "0";
        return ans.toString();
    }
}