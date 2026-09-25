class Solution {
    public boolean checkPerfectNumber(int num) {
        Set<Integer> divisorSet = new HashSet<>();
        for(int i=1;i<=Math.sqrt(num);i++){
            if(num % i == 0){
                divisorSet.add(i);
                if(num/i == num || i == num){
                    continue;
                }else{
                    
                    divisorSet.add(num/i);
                }
            }
        }
        int sum = 0;
        for(Integer x : divisorSet){
            if(x == num){
                continue;
            }
            sum += x;
        }
        return sum == num;
    }
}