public class Test {

    public static void main(String[] args) {
        int i = longestValidParentheses("()()()))(()()(");
        System.out.println(i);
    }

    public static int longestValidParentheses(String s) {
        if (s == null || s.length() < 1)
            return 0;
        int left = 0, right = 0, max = 0;
        // 从左到右
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left++;
                System.out.println(left + "左到右的left");
            } else {
                right++;
                System.out.println(right + "左到右的right");
            }
            if (left == right) {
                max = Math.max(max, 2 * right);
                System.out.println(max + "左到右的max");
            } else if (right > left) {
                left = right = 0;
            }
        }
        left = right = 0;
        // 从右到左
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                left++;
                System.out.println(left + "-----从右到左的left");
            } else {
                right++;
                System.out.println(right + "-----从右到左的right");
            }
            if (left == right) {
                max = Math.max(max, 2 * left);
                System.out.println(max + "------从右到左的max");
            } else if (left > right) {
                left = right = 0;
            }
        }
        return max;
    }

    public static int longestValidParentheses2(String s) {
        int max = 0, left = 0, right = 0;

        return max;
    }
}

