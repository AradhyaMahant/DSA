package Queue;

public class Queue {
	
	private ListNode front;
	private ListNode rear;
	private int length;
	
	public Queue(){
		this.front=null;
		this.rear=null;
		this.length=0;
	}
	
	public class ListNode {
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public int length() {
		return length;
	}
	
	public boolean isEmpty() {
		return length==0;
	}
	//instering elemnet into queue
	public void enqueue(int data) {
		ListNode temp = new ListNode(data);
		if(isEmpty()) {
			front = temp;
		}else {
			rear.next=temp;
		}
		rear=temp;
		length++;
	}
	
	
	
	//deleting element into queue
	public ListNode dequeue() {
		ListNode temp= front;
		if(isEmpty()) {
			front = null;
		}else{
			temp=front;
			front=front.next;
		}
		length--;
		return temp;
	}
	
	
	public void print() {
		if(isEmpty()) {
			return;
		}
		ListNode current = front;
		while(current!=null) {
			System.out.print(current.data+" --> ");
			current = current.next;
		}
		System.out.print("null");
	}
	
	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue(0);
		q.enqueue(11);
		q.enqueue(8);
		q.dequeue();
		q.print();
	}
}