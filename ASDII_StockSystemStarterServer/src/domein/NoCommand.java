package domein;

public class NoCommand implements Command {

	private String methodName;

	public String execute() {
		return methodName + " is an undefined Command. Please choose a correct command";
	}

	public NoCommand(String methodName) {
		this.methodName = methodName;
	}
}
