package domein;

import java.util.stream.Collectors;
import java.util.*;
public abstract class Document 
{

	private List<Page> pages;



	protected abstract List<Page> createPages();
	
	public Document() {
		pages = createPages();
	}

    
    public String print() {
        return pages.stream()
                .map(Page::print)
                .collect(Collectors.joining("\n"));
    }
}
