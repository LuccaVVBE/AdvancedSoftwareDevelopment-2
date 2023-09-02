package domein;

public class GarageDoorOpenCommand implements Command {

	private GarageDoor garageDeur;
	public void execute() {
		garageDeur.lightOn();
		garageDeur.up();;
	}

	public GarageDoorOpenCommand(GarageDoor deur) {
		garageDeur = deur;
	}

	public void undo() {
		garageDeur.down();
		garageDeur.lightOff();
	}
	
}