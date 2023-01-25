package driverPOJOClass;

import java.util.List;

public class DriverMainPojoTest {
	private List<Data> data;
	private List<Source> source;
	
	//No argument Constructor
	public DriverMainPojoTest() {
		super();
	}
	
	//Parameterised Constructor 
	public DriverMainPojoTest(List<Data> data, List<Source> source) {
		super();
		this.data = data;
		this.source = source;
	}

	//Provide getter and Setter method
	public List<Data> getData() {
		return data;
	}

	public void setData(List<Data> data) {
		this.data = data;
	}

	public List<Source> getSource() {
		return source;
	}

	public void setSource(List<Source> source) {
		this.source = source;
	}
	
}
