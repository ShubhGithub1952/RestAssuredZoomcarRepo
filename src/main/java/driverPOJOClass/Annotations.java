package driverPOJOClass;

public class Annotations {
	private String source_name;
	private String source_description;
	private String dataset_name;
	private String dataset_link;
	private String table_id;
	private String topic;
	private String subtopic;
	
	//Create No argument Constructor
	public Annotations() {
		super();
	}
	
	//Create Parameterised Construcor
	public Annotations(String source_name, String source_description, String dataset_name, String dataset_link,
			String table_id, String topic, String subtopic) {
		super();
		this.source_name = source_name;
		this.source_description = source_description;
		this.dataset_name = dataset_name;
		this.dataset_link = dataset_link;
		this.table_id = table_id;
		this.topic = topic;
		this.subtopic = subtopic;
	}

	//Provide getter and setter methods
	public String getSource_name() {
		return source_name;
	}

	public void setSource_name(String source_name) {
		this.source_name = source_name;
	}

	public String getSource_description() {
		return source_description;
	}

	public void setSource_description(String source_description) {
		this.source_description = source_description;
	}

	public String getDataset_name() {
		return dataset_name;
	}

	public void setDataset_name(String dataset_name) {
		this.dataset_name = dataset_name;
	}

	public String getDataset_link() {
		return dataset_link;
	}

	public void setDataset_link(String dataset_link) {
		this.dataset_link = dataset_link;
	}

	public String getTable_id() {
		return table_id;
	}

	public void setTable_id(String table_id) {
		this.table_id = table_id;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getSubtopic() {
		return subtopic;
	}

	public void setSubtopic(String subtopic) {
		this.subtopic = subtopic;
	}
	
}
