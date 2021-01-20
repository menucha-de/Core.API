package havis.util.core.log;

public class LogTarget {

	private String name;
	private String label;

	public LogTarget() {
	}

	public LogTarget(String name, String label) {
		this.name = name;
		this.label = label;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	private boolean equals(LogTarget obj) {
		return name == obj.name || name != null && name.equals(obj.name);
	}

	@Override
	public boolean equals(Object obj) {
		return this == obj || (obj instanceof LogTarget) && equals((LogTarget) obj);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "{'name': '" + name + "', 'label': '" + label + "'}";
	}
}