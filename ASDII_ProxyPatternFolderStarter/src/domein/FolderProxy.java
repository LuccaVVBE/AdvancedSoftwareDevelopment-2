package domein;

public class FolderProxy implements FolderInterface {

	private Folder folder;
	private UserManager um;
	private User user;

	public String performOperations() {
		if(um.hasFolderAccess(user)) {
			return folder.performOperations();
		}
		return "Restricted access...";
	}

	public FolderProxy(Folder folder, User user, UserManager um) {
		this.folder = folder; 
		this.user = user;
		this.um = um;
	}
}
