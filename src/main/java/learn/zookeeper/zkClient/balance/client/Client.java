package learn.zookeeper.zkClient.balance.client;

public interface Client {

	public void connect() throws Exception;
	public void disConnect() throws Exception;
	
}
