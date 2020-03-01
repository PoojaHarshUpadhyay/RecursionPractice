class CombinationIterator {

    Queue<String> queue = new LinkedList<>();
    
    public CombinationIterator(String characters, int combinationLength) {
        char[] c = characters.toCharArray();
        StringBuilder sb = new StringBuilder();
        doWork(c, combinationLength, sb, 0 );
    }
    private void doWork(char[] c, int combLength, StringBuilder sb, int start) {
        if(sb.length() == combLength) {
            queue.add(sb.toString());
            return;
        }
        
        for(int i = start; i < c.length; i++) {
            sb.append(c[i]);
            start = start+1;
            doWork(c, combLength, sb, start);
            sb.deleteCharAt(sb.length() -1);
        }
    }
    
    public String next() {
        String res = "";
        if(!queue.isEmpty()){
            res = queue.poll();
        }
        return res;
    }
    
    public boolean hasNext() {
        return !queue.isEmpty();
    }
}

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
