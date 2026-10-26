class Solution {
    public int calPoints(String[] operations) {
        int ans = 0;
        Deque<String> stack = new ArrayDeque<>();

        for(String s: operations){
            if(stack.size() == 0){
                stack.offerFirst(s);
                continue;
            }

            if(s.equals("+")){
                String el1 = stack.pollFirst();
                String el2 = stack.pollFirst();
                stack.offerFirst(el2);
                stack.offerFirst(el1);
                stack.offerFirst(String.valueOf(Integer.valueOf(el1) + Integer.valueOf(el2)));
            }
            else if(s.equals("C")){
                stack.pollFirst();
            }
            else if(s.equals("D")){
                stack.offerFirst(String.valueOf(2*Integer.valueOf(stack.peekFirst())));
            }
            else{
                stack.offerFirst(s);
            }
        }

        while(stack.size() > 0){
            ans += Integer.valueOf(stack.pollFirst());
        }

        return ans;
    }
}