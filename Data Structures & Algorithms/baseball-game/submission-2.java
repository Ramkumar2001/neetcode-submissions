class Solution {
    public int calPoints(String[] operations) {
        int ans = 0;
        Deque<Integer> stack = new ArrayDeque<>();

        for(String s: operations){
            if(stack.size() == 0){
                stack.offerFirst(Integer.valueOf(s));
                continue;
            }

            if(s.equals("+")){
                int el1 = stack.pollFirst();
                int el2 = stack.peekFirst();
                stack.offerFirst(el1);
                stack.offerFirst(el1 + el2);
            }
            else if(s.equals("C")){
                stack.pollFirst();
            }
            else if(s.equals("D")){
                stack.offerFirst(2 * Integer.valueOf(stack.peekFirst()));
            }
            else{
                stack.offerFirst(Integer.valueOf(s));
            }
        }

        while(stack.size() > 0){
            ans += stack.pollFirst();
        }

        return ans;
    }
}