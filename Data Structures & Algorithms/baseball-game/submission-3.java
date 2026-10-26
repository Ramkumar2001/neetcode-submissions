class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (String op : operations) {
            switch (op) {
                case "+" -> {
                    int top = stack.pop();
                    int sum = top + stack.peek();
                    stack.push(top);
                    stack.push(sum);
                }
                case "D" -> stack.push(2 * stack.peek());
                case "C" -> stack.pop();
                default -> stack.push(Integer.parseInt(op));
            }
        }

        int total = 0;
        for (int score : stack) {
            total += score;
        }

        return total;
    }
}