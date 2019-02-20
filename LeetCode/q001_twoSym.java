package LeetCode;

import java.awt.font.NumericShaper;
import java.text.Normalizer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class q001_twoSym {
    /**
     *  Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     *         You may assume that each input would have exactly one solution.
     *         Given nums = [2, 7, 11, 15], target = 9,
     *         Because nums[0] + nums[1] = 2 + 7 = 9,
     *         return [0, 1].
     * @param args
     */
    public static void main(String [] args){
        int [] arr =new  int[]{2, 7, 11, 15};
        int taeget =9;
        //int[] solution = solution(arr, taeget);
        int[] solution = solution2(arr, taeget);

        Arrays.stream(solution).forEach(System.out::println);

    }

    /**
     * 双层循环
     * @param nums
     * @param taeget
     * @return
     */

    public static int [] solution(int []nums, int taeget){
        for (int i =0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==taeget-nums[j]){

                        return new int[] {i,j};

                }


            }

        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * 使用的map的特性
     * @param nums
     * @param target
     * @return
     */
    public static int[] solution2(int [] nums,int target){
        Map<Integer,Integer> map =new HashMap() ;

        for(int i =0;i<nums.length;i++){
            map.put(nums[i],i ) ;

        }
        for(int i=0;i<nums.length;i++){
            int temp = target-nums[i];
            if (map.containsKey(temp)){

                return new int[]{map.get(temp),i};

            }

        }

        throw  new IllegalArgumentException("no sums results");
    }


    }


