package domein;

import java.util.ArrayList;
import java.util.List;

public class ResumeDocument extends Document {

	public List<Page> createPages() {
		return new ArrayList<>(List.of(new SkillsPage(), new EducationPage(), new ExperiencePage()));
	}
}
