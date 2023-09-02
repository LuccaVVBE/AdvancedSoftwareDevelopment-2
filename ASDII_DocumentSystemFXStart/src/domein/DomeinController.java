package domein;

import java.util.*;

public class DomeinController 
{
	private Document document;
	
	private CommandFactory commandFactory;

	private Deque<Command> commands;

	public DomeinController()
	{
		document = new Document();
		commandFactory = new CommandFactory(document);
		commands = new ArrayDeque<>();
	}
	
	public String readDocument()
	{
		return document.readDocument();
	}

	public void execute(String tekst, String actie) {
		//TODO
		if(!actie.equals("Undo")) {
			Command comm = commandFactory.createCommand(tekst, actie);
			comm.execute();
			commands.push(comm);
		}
		else {
			if(!commands.isEmpty()) {
				commands.pop().undo();
			}
		}
		
	
	}
}
