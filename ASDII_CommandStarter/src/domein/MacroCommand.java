package domein;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class MacroCommand implements Command {
    private Command[] commands;
    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }
    @Override
    public void execute() {
        Arrays.stream(commands).forEach(Command::execute);
    }
	public void undo() {
//		List<Command> commandList = new ArrayList<>(Arrays.asList(commands));
//		Collections.reverse(commandList);
//		commandList.forEach((x)->x.undo());
		new LinkedList<>(Arrays.asList(commands)).descendingIterator().forEachRemaining(x->x.undo());
	}
    /* NOTE:  these commands have to be done backwards to 
     ensure proper undo functionality */


}
