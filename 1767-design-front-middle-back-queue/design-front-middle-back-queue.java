class FrontMiddleBackQueue {
    ArrayList<Integer>list;
    public FrontMiddleBackQueue() {
        list= new ArrayList<>();
    }
    
    public void pushFront(int val) {
        list.add(0,val);
    }
    
    public void pushMiddle(int val) {
        int k=list.size()/2;
        list.add(k,val);
    }
    
    public void pushBack(int val) {
        list.add(list.size(),val);
    }
    
    public int popFront() {
        if(list.isEmpty()){
            return -1;
        }
        int k = list.get(0);
        list.remove(0);
        return k;
    }
    
    public int popMiddle() {
        if(list.isEmpty()) return -1;
        int k = (list.size()-1)/2;
        int val = list.remove(k);
        return val;

    }
    
    public int popBack() {
     if(list.isEmpty()) return -1;
     return list.remove(list.size()-1);

    }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */