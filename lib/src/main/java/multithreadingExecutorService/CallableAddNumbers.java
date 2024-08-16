package multithreadingExecutorService;

import java.util.List;
import java.util.concurrent.Callable;

public class CallableAddNumbers implements Callable<Integer> {
	
	private CustomArrayPartitionDTO customArrayPartitionDTO;
	
	CallableAddNumbers(CustomArrayPartitionDTO customArrayPartitionDTO) {
		this.customArrayPartitionDTO = customArrayPartitionDTO;
	}

	public CallableAddNumbers(int l, int r, List<Integer> arrList) {
		this.customArrayPartitionDTO = new CustomArrayPartitionDTO(l, r, arrList);
	}



	@Override
	public Integer call() throws Exception {
		int sum = 0;
		int l = customArrayPartitionDTO.l;
		int r = customArrayPartitionDTO.r;
		List<Integer> arrList = customArrayPartitionDTO.list;
		for(int i = l; i <= r && i < arrList.size() ; i++) {
			sum += arrList.get(i);
		}
		return sum;
	}
	
}