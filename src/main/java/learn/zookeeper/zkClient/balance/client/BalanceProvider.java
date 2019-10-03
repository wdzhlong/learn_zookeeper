package learn.zookeeper.zkClient.balance.client;

import java.util.List;

public interface BalanceProvider<T> {
	
	public T getBalanceItem();
	

}
