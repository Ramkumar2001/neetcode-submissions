class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] words1 = sentence1.split(" ");
        String[] words2 = sentence2.split(" ");

        if(words2.length > words1.length){
            String[] tmp = words1;
            words1 = words2;
            words2 = tmp;
        }

        int l2 = 0, r2 = words2.length - 1;
        int l1 = 0, r1 = words1.length - 1;
        while(l2 <= r2){
            if(words1[l1].equals(words2[l2])){
                l1 += 1; l2 += 1;
            }
            else if(words2[r2].equals(words1[r1])){
                r2 -= 1;
                r1 -= 1;
            }
            else return false;
        }

        return true;

    }
}
