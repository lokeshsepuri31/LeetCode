
public class Medium1011 {

	public static int shipWithinDays(int[] weights, int days) {
		
		int low = Integer.MIN_VALUE;
		int high = 1;
		
		for(int i : weights) {
			high += i;
			low = Math.max(low, i);
		}
		
		while(low <= high) {
			int mid = (low + high) / 2;
			int day = calDays(weights, mid);
			if(days < day) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		
		return low;
		
	}
	
	private static int calDays(int[] weights, int capacity) {
		int day = 1, load = 0;
		for(int i : weights) {
			if(load + i > capacity) {
				day +=1;
				load = i;
			} else {
				load += i;
			}
		}
		return day;
	}
	
	public static void main(String[] args) {
		int[] weights = {1,2,3,4,5,6,7,8,9,10};
		int d = 5;
		System.out.println(shipWithinDays(weights, d));
	}
}
