package AIO.Server;

/**
 * Created by Ellen on 2017/8/5.
 */
public class TimeServer {
	public static void main(String[] args) {
		int port = 8080;
		if (args != null && args.length > 0) {
			try {
				port = Integer.valueOf(args[0]);
			} catch (NumberFormatException e) {
			}
		}
		AsyncTimeServerHander timeServerHander = new AsyncTimeServerHander(port);
		new Thread(timeServerHander, "AIO-AsyncTimeServerHandler-001").start();
	}
}
