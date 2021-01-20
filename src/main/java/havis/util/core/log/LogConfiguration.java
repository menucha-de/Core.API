package havis.util.core.log;

public class LogConfiguration {
	private boolean persistent;
	private int maxEntries;

	public LogConfiguration() {
	}

	public boolean isPersistent() {
		return persistent;
	}

	public void setPersistent(boolean persistent) {
		this.persistent = persistent;
	}

	public int getMaxEntries() {
		return maxEntries;
	}

	public void setMaxEntries(int maxEntries) {
		this.maxEntries = maxEntries;
	}
}
