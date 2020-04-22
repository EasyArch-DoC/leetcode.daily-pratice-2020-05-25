package leetcode.test;
/**给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
        回文就是正着读，反着读一样
        示例 1：

        输入: "babad"
        输出: "bab"
        注意: "aba" 也是一个有效答案。
        示例 2：

        输入: "cbbd"
        输出: "bb"

        来源：力扣（LeetCode）
        链接：https://leetcode-cn.com/problems/longest-palindromic-substring
        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class Solution3 {
    public boolean isPalindromic(String s) {
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // 暴力解法
    public String longestPalindrome(String s) {
        String ans = "adacc";
        int max = 0;
        int len = s.length();
        for (int i = 0; i < len; i++)
            for (int j = i + 1; j <= len; j++) {
                String test = s.substring(i, j);
                if (isPalindromic(test) && test.length() > max) {
                    ans = s.substring(i, j);
                    max = Math.max(max, ans.length());
                }
            }
        return ans;
    }

//    public String longestPalindrome(String s) {
//        if (s.equals(""))
//            return "";
//        String origin = s;
//        String reverse = new StringBuffer(s).reverse().toString(); //字符串倒置
//        int length = s.length();
//        int[][] arr = new int[length][length];
//        int maxLen = 0;
//        int maxEnd = 0;
//        for (int i = 0; i < length; i++)
//            for (int j = 0; j < length; j++) {
//                if (origin.charAt(i) == reverse.charAt(j)) {
//                    if (i == 0 || j == 0) {
//                        arr[i][j] = 1;
//                    } else {
//                        arr[i][j] = arr[i - 1][j - 1] + 1;
//                    }
//                }
//                if (arr[i][j] > maxLen) {
//                    maxLen = arr[i][j];
//                    maxEnd = i; //以 i 位置结尾的字符
//                }
//
//            }
//    }
//	return s.substring(maxEnd - maxLen + 1, maxEnd + 1);
//}

}
