import java.io.UnsupportedEncodingException;

public class Test {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "Hr L Bockhoudt en/of\u00A0Mw K Bockhoudt-van der Zijl";
		byte arr[]= str.getBytes("UTF-8");
		for(byte e : arr) {
			System.out.println((char)e);
		}
	}
}
