class KthLargest {
    private int k;
    private PriorityQueue<Integer> heap = new PriorityQueue<>();
    
    public KthLargest(int k, int[] nums) {
        this.k= k;
        
        for(int num : nums){
            heap.offer(num);
        }
        
        while(heap.size() > k){
            heap.poll();
        }
    }
    
    public int add(int val) {
        heap.offer(val);
        while(heap.size() > k){
            heap.poll();
        }
        
        return heap.peek();
    }
}