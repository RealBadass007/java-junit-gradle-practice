package multithreadingExecutorService;

import java.util.List;
import java.util.concurrent.Callable;

public class CallableAddNumbers implements Callable<Integer> {
	
	private List<Integer> arrList;
	int l;
	int r;
	
	CallableAddNumbers(List<Integer> arrList, int l, int r) {
		this.arrList = arrList;
		this.l = l;
		this.r = r;
	}

	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for(int i = l; i <= r && i < arrList.size() ; i++) {
			sum += arrList.get(i);
		}
		return sum;
	}
	
}