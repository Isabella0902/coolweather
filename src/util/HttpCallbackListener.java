package util;

public interface HttpCallbackListener {

	//�ӿ������������󷽷�
	public abstract void onFinish(String response);
	public abstract void onError(Exception e);
}
