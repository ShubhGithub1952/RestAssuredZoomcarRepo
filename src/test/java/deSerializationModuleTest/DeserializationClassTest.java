package deSerializationModuleTest;

import java.io.File;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.json.JsonMapper;

import driverPOJOClass.DriverMainPojoTest;

public class DeserializationClassTest {
	@Test
	public void deserializationMethod() throws Throwable {
		JsonMapper jsonObject = new JsonMapper();
		DriverMainPojoTest deserializeObject = jsonObject.readValue(new File(".\\ComplexJson.json"), DriverMainPojoTest.class);
		String subtopic = deserializeObject.getSource().get(0).getAnnotations().getSubtopic();
		System.out.println(subtopic);
		String dataset_link = deserializeObject.getSource().get(0).getAnnotations().getDataset_link();
		System.out.println(dataset_link);
		String Population = deserializeObject.getData().get(6).getPopulation();
        System.out.println(Population);
	}
}
