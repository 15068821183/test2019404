package lock;

import java.util.List;
import java.util.concurrent.TimeoutException;

public class BooleanLock implements Lock {

	//22
	//11
	
	@Override
	public void lock() throws InterruptedException {
		// TODO Auto-generated method stub

	}

	@Override
	public void lock(long mills) throws InterruptedException, TimeoutException {
		// TODO Auto-generated method stub

	}

	@Override
	public void unlock() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Thread> getBlockedThreads() {
		// TODO Auto-generated method stub
		return null;
	}

}
