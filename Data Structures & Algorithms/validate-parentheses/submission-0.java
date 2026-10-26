class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for(char c: s.toCharArray()){
            if(stack.isEmpty()){
                stack.offerFirst(c);
                continue;
            }

            char ch = stack.peekFirst();
            if((ch == '[' && c == ']') || (ch == '{' && c == '}') || (ch == '(' && c == ')')){
                stack.pollFirst();
            }
            else{
                stack.offerFirst(c);
            }

        }

        return stack.size() == 0;
    }
}
