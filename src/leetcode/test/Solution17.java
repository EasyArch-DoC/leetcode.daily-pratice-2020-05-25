package leetcode.test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 *
 * candidates 中的每个数字在每个组合中只能使用一次。
 *
 * 说明：
 *
 * 所有数字（包括目标数）都是正整数。
 * 解集不能包含重复的组合。 
 * 示例 1:
 *
 * 输入: candidates = [10,1,2,7,6,1,5], target = 8,
 * 所求解集为:
 * [
 *   [1, 7],
 *   [1, 2, 5],
 *   [2, 6],
 *   [1, 1, 6]
 * ]
 * 示例 2:
 *
 * 输入: candidates = [2,5,2,1,2], target = 5,
 * 所求解集为:
 * [
 *   [1,2,2],
 *   [5]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/combination-sum-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution17 {
    public List<List<Integer>> result = new LinkedList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if(candidates.length == 0){
            return result;
        }
        Arrays.sort(candidates);
        comSum2(candidates,target,0,new LinkedList<Integer>());
        return result;

    }
    public void comSum2(int[] candidates, int target, int index, LinkedList<Integer> trace){
        //满足结束条件
        if(target == 0){
            result.add(new LinkedList(trace));
            return ;
        }
        if(target > 0){
            //选择列表，并加上约束
            for(int i = index; i<candidates.length; i++){
                //如果以当前结点为头结点的所有组合都找完了，那么下一个与他他相同的头结点就不用去找了。
                if(i > index && candidates[i] == candidates[i - 1]) continue;
                //做出选择
                trace.add(candidates[i]);
                comSum2(candidates,target - candidates[i],i+1,trace);
                //撤销选择
                trace.removeLast();
            }
        }
    }

}
