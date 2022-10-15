package dependency_inversion;

public class MainProject {
	 
	private BackendDeveloper back = new BackendDeveloper();
	    private FrontendDeveloper front = new FrontendDeveloper();

	    public void implement() {
	        back.writeJava();
	        front.writeJavaScript();
	    }
	}