class Solution {
    public int calPoints(String[] operations) {
        List<Integer> stack = new ArrayList<>();
        for (String op : operations) {
            switch (op) {
                case "C":
                    stack.remove(stack.size()-1);
                    break;
                case "D":
                    stack.add(stack.get(stack.size()-1)*2);
                    break;
                case "+":
                    int size = stack.size();
                    stack.add(stack.get(size-1)+stack.get(size-2));
                    break;
                default:
                    stack.add(Integer.parseInt(op));
                    break;
            }
        }
        int res = 0;
        for (int score : stack) res += score;
        return res;
    }
}
