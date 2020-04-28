package leetcode.test;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-common-prefix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution8 {
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            if(strs.length == 0)
                return "";
            String ans = strs[0];
            for(int i =1;i<strs.length;i++) {
                int j=0;
                for(;j<ans.length() && j < strs[i].length();j++) {
                    if(ans.charAt(j) != strs[i].charAt(j))
                        break;
                }
                ans = ans.substring(0, j);
                if(ans.equals(""))
                    return ans;
            }
            return ans;
        }
    }
    //方法2
    class Solution2 {
        public String longestCommonPrefix(String[] strs) {
            if(strs.length==0)return "";
            String ans=strs[0];
            int minLen=Integer.MAX_VALUE;
            for(int i=0;i<strs.length;i++){
                if(strs[i].length()<minLen){
                    minLen=strs[i].length();
                }
            }

            for(int i=1;i<strs.length;i++){
                int j=0;
                for(;j<ans.length() && j<minLen;j++){
                    if(ans.charAt(j)!= strs[i].charAt(j)){
                        break;
                    }
                }
                ans=ans.substring(0,j);
                if(ans.equals(""))return ans;
            }

            return ans;
        }
    }
    //遍历法
    class Solution3{
        public String longestCommonPrefix(String[] strs) {
            if(strs==null||strs.length==0) return "";
            int i = 0;
            StringBuilder res = new StringBuilder();
            while(i<strs[0].length()){
                String pre = strs[0];
                for(int j = 1;j<strs.length;j++){
                    if(strs[j].length()<i+1||pre.charAt(i)!=strs[j].charAt(i)){
                        return res.toString();
                    }
                    pre = strs[j];
                }
                res.append(pre.charAt(i));
                i++;
            }
            return res.toString();

        }
    }

}
