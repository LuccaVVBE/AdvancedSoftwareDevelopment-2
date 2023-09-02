package domein;

public class DrawingApplication extends Application {

	protected Document createDocument() {
		return new DrawingDocument();
	}
}
