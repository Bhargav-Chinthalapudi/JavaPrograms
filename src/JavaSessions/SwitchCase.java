package JavaSessions;

public class SwitchCase {

	public static void main(String[] args) {
		String browser = "CHROME";
		switch (browser.toLowerCase()) {
		case "chrome":
			System.out.println("launch chrome");
			break;

		case "firefox":
			System.out.println("launch firefox");
			break;
		default:
			System.out.println("please pass the right user");
			break; // It should be associated in a loop.
		}
		
		// && short circuit operator

	}

}
