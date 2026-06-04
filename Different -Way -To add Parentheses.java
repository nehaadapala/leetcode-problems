class Solution {
    public List<Integer> diffWaysToCompute(String exp) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < exp.length(); i++) {
            char op = exp.charAt(i);

            if (op == '+' || op == '-' || op == '*') {
                List<Integer> l = diffWaysToCompute(exp.substring(0, i));
                List<Integer> r = diffWaysToCompute(exp.substring(i + 1));

                for (int a : l) {
                    for (int b : r) {
                        if (op == '+') {
                            ans.add(a + b);
                        } else if (op == '-') {
                            ans.add(a - b);
                        } else {
                            ans.add(a * b);
                        }
                    }
                }
            }
        }

        if (ans.isEmpty()) {
            ans.add(Integer.parseInt(exp));
        }

        return ans;
    }
}