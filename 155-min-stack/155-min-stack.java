class MinStack {
    
    private List<Integer> values;
    private int min;
    private int indexOfLast;
    private int indexOfMin;

    public MinStack() {
        values = new LinkedList<>();
        min = Integer.MAX_VALUE;
        indexOfLast = -1;
        indexOfMin = -1;
    }
    
    public void push(int val) {
        indexOfLast++;
        if(val < min) {
            min = val;
            indexOfMin = indexOfLast;
        }
        values.add(val);
    }
    
    public void pop() {
        values.remove(values.size() - 1);
        int newMin = Integer.MAX_VALUE;
        int indexOfNewMin = -1;
        for(int i = 0; i < values.size(); i++) {
            if(values.get(i) < newMin) {
                newMin = values.get(i);
                indexOfNewMin = i;
            }
        }
        min = newMin;
        indexOfMin = indexOfNewMin;
    }
    
    public int top() {
        return values.get(values.size() - 1);
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */