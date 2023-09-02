package domein;

public class ScreenFactory {

	public static Screen createScreen(String type) {

		return switch (type.toLowerCase()) {
		case "win" -> new Screen(new WindowsFactory());
		case "mac" -> new Screen(new MacFactory());
		default -> null;
		};
	}
	
}
