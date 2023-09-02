package domein;

public class NoCommand implements Command {

	private String name;

	public String execute() {
		return name;
	}

	public NoCommand(String name) {
		this.name=name;
	}
}
