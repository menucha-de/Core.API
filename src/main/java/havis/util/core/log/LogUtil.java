package havis.util.core.log;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogUtil {

	private static ThreadLocal<DateFormat> dateFormat = new ThreadLocal<DateFormat>() {
		@Override
		protected DateFormat initialValue() {
			return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		}
	};

	private LogUtil() {
	}

	/**
	 * Format log entry
	 * 
	 * @param entry the log entry to format
	 * @return the formatted string
	 */
	public static String format(LogEntry entry) {
		return entry.getLevel().toString() + "\t" + dateFormat.get().format(new Date(entry.getTime())) + " " + entry.getTargetName() + "[" + entry.getThread() + "]" + ": " + entry.getMessage()
				+ (entry.getParameters() != null && entry.getParameters().length() > 0 ? " (" + entry.getParameters() + ")" : "")
				+ (entry.getThrown() != null && entry.getThrown().length() > 0 ? "\n" + entry.getThrown() : "");
	}
}
