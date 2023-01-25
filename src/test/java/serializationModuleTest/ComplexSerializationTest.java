package serializationModuleTest;



import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.json.JsonMapper;

import driverPOJOClass.Annotations;
import driverPOJOClass.Data;
import driverPOJOClass.DriverMainPojoTest;
import driverPOJOClass.Source;

public class ComplexSerializationTest {
	@Test
	public void serializationMethodTest() throws Throwable {
		String source_description="The American Community Survey (ACS) is conducted by the US Census and sent to a portion of the population every year.";	
		 Annotations annotationObject = new Annotations("Census Bureau", source_description, "ACS 5-year Estimate", "http://www.census.gov/programs-surveys/acs/", "B01003", "Diversity", "Demographics");
		 Source sourceObject = new Source(annotationObject, "acs_yg_total_population_5");
		 
		 Data dataObj1 = new Data("01000US", "United States", "2020", "2020", "326569308", "united-states");
		 Data dataObj2 = new Data("01000US", "United States", "2019", "2019", "324697795", "united-states");
		 Data dataObj3 = new Data("01000US", "United States", "2018", "2018", "322903030", "united-states");
		 Data dataObj4 = new Data("01000US", "United States", "2017", "2017", "321004407", "united-states");
		 Data dataObj5 = new Data("01000US", "United States", "2016", "2016", "318558162", "united-states");
		 Data dataObj6 = new Data("01000US", "United States", "2015", "2015", "316515021", "united-states");
		 Data dataObj7 = new Data("01000US", "United States", "2014", "2014", "314107084", "united-states");
		 Data dataObj8 = new Data("01000US", "United States", "2013", "2013", "311536594", "united-states");
		 
		List<Data> arrayListObj = new ArrayList<Data>();
		arrayListObj.add(dataObj1);
		arrayListObj.add(dataObj2);
		arrayListObj.add(dataObj3);
		arrayListObj.add(dataObj4);
		arrayListObj.add(dataObj5);
		arrayListObj.add(dataObj6);
		arrayListObj.add(dataObj7);
		arrayListObj.add(dataObj8);
		
		List<Source> sourceListObject = new ArrayList<Source>();
		sourceListObject.add(sourceObject);
		
		DriverMainPojoTest serializationObject = new DriverMainPojoTest(arrayListObj, sourceListObject);
		JsonMapper jsonObject = new JsonMapper();
		jsonObject.writeValue(new File("./ComplexJson.json"), serializationObject);
	}
















}
