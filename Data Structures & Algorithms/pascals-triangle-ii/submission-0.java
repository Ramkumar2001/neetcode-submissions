class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> initial = List.of(0,1,0);

        while(rowIndex > 0){
            List<Integer> nextRow = new ArrayList<>();
            nextRow.add(0);
            for(int i = 0; i < initial.size() - 1; i += 1){
                nextRow.add(initial.get(i) + initial.get(i+1));
            }
            nextRow.add(0);
            initial = nextRow;
            rowIndex -= 1;
        }

        return initial.subList(1, initial.size()-1);

        
    }
}