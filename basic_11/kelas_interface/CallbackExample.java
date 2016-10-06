import java.util.ArrayList;
import java.util.List;

/* interface */
interface CallBack {
    void methodToCallBack();
    void methodToCallBack(String args, int data);
}

/* contoh menggunakan implementasi */
/* Cara 1 */
class CallBackImpl implements CallBack {
	@Override
    public void methodToCallBack() {
        System.out.println("I've been called back");
    }

	@Override
	public void methodToCallBack(String args, int data) {
		System.out.println("I've been called back and value "+args+" and "+data);
	}
}

/* Cara menggunakannya */
public class CallbackExample {

	/* Kirim nilai dari sini */
    public void register(CallBack callback) {
        callback.methodToCallBack();
        callback.methodToCallBack("data",5);
    }

    public static void main(String[] args) {
    	CallbackExample caller = new CallbackExample();
    	
    	/* Cara ke 2 */
        caller.register(new CallBack() {
        	
			@Override
			public void methodToCallBack(String args, int data) {
				System.out.println("I've been called back and value "+args+" and "+data);
			}
			
			@Override
			public void methodToCallBack() {
				System.out.println("I've been called back");
			}
		});
    }
} 