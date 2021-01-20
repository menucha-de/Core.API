package havis.util.core.log;

public class LogEntry {

	private long id, time;
	private String targetName, sourceClass, sourceMethod;
	private LogLevel level;
	private String message, parameters, thrown;
	private int thread;

	public LogEntry() {
	}

	public LogEntry(long id, long time, String targetName, String sourceClass, String sourceMethod, LogLevel level, String message, String parameters,
			String thrown, int thread) {
		this.id = id;
		this.time = time;
		this.targetName = targetName;
		this.sourceClass = sourceClass;
		this.sourceMethod = sourceMethod;
		this.level = level;
		this.message = message;
		this.parameters = parameters;
		this.thrown = thrown;
		this.thread = thread;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public String getTargetName() {
		return targetName;
	}

	public void setTargetName(String targetName) {
		this.targetName = targetName;
	}

	public String getSourceClass() {
		return sourceClass;
	}

	public void setSourceClass(String sourceClass) {
		this.sourceClass = sourceClass;
	}

	public String getSourceMethod() {
		return sourceMethod;
	}

	public void setSourceMethod(String sourceMethod) {
		this.sourceMethod = sourceMethod;
	}

	public LogLevel getLevel() {
		return level;
	}

	public void setLevel(LogLevel level) {
		this.level = level;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getParameters() {
		return parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}

	public String getThrown() {
		return thrown;
	}

	public void setThrown(String thrown) {
		this.thrown = thrown;
	}

	public int getThread() {
		return thread;
	}

	public void setThread(int thread) {
		this.thread = thread;
	}
	
	private boolean equals(LogEntry obj) {
		return id == obj.id;
	}

	@Override
	public boolean equals(Object obj) {
		return this == obj || (obj instanceof LogEntry) && equals((LogEntry) obj);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public String toString() {
		return "{'id': " + id + ", 'time': " + time + ", 'targetName': '" + targetName + "', 'sourceClass': '" + sourceClass + "', 'sourceMethod': '"
				+ sourceMethod + "', 'level': '" + level + "', 'message': '" + message + "', 'parameters': '" + parameters + "', 'thrown': '" + thrown
				+ "', 'thread': " + thread + "}";
	}
}