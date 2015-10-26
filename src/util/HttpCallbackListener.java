package util;

public interface HttpCallbackListener {

	//接口中有两个抽象方法
	public abstract void onFinish(String response);
	public abstract void onError(Exception e);
}
