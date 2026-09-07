class Solution {
    public int distinctSubseqII(String s) {
        int mod = 1000000007;
        int dp[] = new int[s.length() + 1];
        dp[0] = 1;
        int[] lastSeen = new int[26];
        Arrays.fill(lastSeen, -1);
        int n = s.length();
        
        for (int i = 1; i <= n; i++) {
            char ch = s.charAt(i - 1); // Fix: 0-indexed string character
            
            // Double the subsequences from the previous step
            dp[i] = (dp[i - 1] * 2) % mod;
            
            // If the character was seen before, subtract duplicate counts
            int charIndex = ch - 'a';
            if (lastSeen[charIndex] != -1) {
                int prevIdx = lastSeen[charIndex];
                // Fix: Add mod before modulo to safely handle negative results
                dp[i] = (dp[i] - dp[prevIdx - 1] + mod) % mod;
            }
            
            // Record the current 1-based index for this character
            lastSeen[charIndex] = i;
        }

        return (dp[s.length()] - 1 + mod) % mod;
    }
}