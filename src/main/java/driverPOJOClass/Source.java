package driverPOJOClass;

public class Source {
	private Annotations annotations;
	private String name;
	
	//Create the No Argument Constructor
	public Source() {
		super();
	}
	
	//Create Parameterised Constructor
	public Source(Annotations annotations, String name) {
		super();
		this.annotations = annotations;
		this.name = name;
	}

	//Provide Getter and Setter Method

	public Annotations getAnnotations() {
		return annotations;
	}

	public void setAnnotations(Annotations annotations) {
		this.annotations = annotations;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
