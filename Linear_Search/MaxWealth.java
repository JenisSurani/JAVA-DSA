package Linear_Search;

public class MaxWealth {

    public static void main(String[] args) {

        int[][] arr = {{11, 22, 33,100,1000}, {44, 55}};

        // 2 person
        // 1st have 11+22+33 = 66 money
        // 2nd have 44+55 = 99 money
        // max wealth has 99 money so return 99

        System.out.println(maximumWealth(arr));
    }

    // practice direct on leetcode because in interview you do not have intellej idea
    static public int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int totalWealth = 0;
            for (int i : account) {
                totalWealth += i;
                // now we have ith person total wealth
            }
                if (totalWealth > maxWealth) {
                    maxWealth = totalWealth;
                }
        }
        return maxWealth;
    }
}
