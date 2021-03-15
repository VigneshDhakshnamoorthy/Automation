package trailtests;

public class user_dir_test {
	public static void main(String[] args) {
		String user_dir = System.getProperty("user.dir");
		String html = "\\test.html";
		String URL = user_dir+html;
		System.out.println(URL);
	}

}
