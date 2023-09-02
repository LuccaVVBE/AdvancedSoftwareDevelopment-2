package domein;

import java.util.ArrayList;
import java.util.List;

public class ReportDocument extends Document {

	public List<Page> createPages() {
		return new ArrayList<>(List.of(new IntroductionPage(), new ConclusionPage(), new SummaryPage(), new BibliographyPage()));
	}
}
