class Solution {
    public long dividePlayers(int[] skill) {
        long sum = 0;
        for(int n : skill){
            sum += n;
        }
        int divisor = skill.length/2;
        long ans = 0;
        Arrays.sort(skill);
        int i = 0, j = skill.length - 1;
        while (i < j){
            if((long)skill[i] + skill[j] != sum/divisor) return -1;
            ans = ans + (long)(skill[i]*skill[j]);
            i += 1;
            j -= 1;
        }

        return ans;

    }
}
