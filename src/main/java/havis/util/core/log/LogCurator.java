package havis.util.core.log;

import java.util.Collection;
import java.util.List;
import java.util.Locale;

/**
 * Interface that specifies a log control. A log control has an underlying log
 * instance and provides methods such as reading the logger's log entries or
 * managing log targets etc.
 */
public interface LogCurator {

	/**
	 * Returns a list of available log levels
	 * 
	 * @return The list of log levels
	 */
	public List<LogLevel> getLevels();

	/**
	 * Returns a list of log targets containing the targets' aliases and
	 * targets' names.
	 * 
	 * @return Log target list
	 */
	public Collection<LogTarget> getTargets();

	/**
	 * Purges the log entries of the given log target.
	 * 
	 * @param targetName
	 *            The name of the log target which log entries will be removed
	 * @return The number of deleted log entries
	 * @throws LogException
	 *             If execution fails
	 */
	public int clear(String targetName) throws LogException;

	/**
	 * Returns the log level of the given log target.
	 * 
	 * @param targetName
	 *            The name of the log target
	 * @return The log level
	 */
	public LogLevel getLevel(String targetName);

	/**
	 * Sets the log level of the given log target
	 * 
	 * @param targetName
	 *            The name of the log target of which the level will be set
	 * @param level
	 *            The log level
	 */
	public void setLevel(String targetName, LogLevel level);

	/**
	 * Returns the number of log entries of the given log target and the given
	 * level. The log level is transformed to a list of effective log levels,
	 * i.e. the list of effective log levels contains the given level itself and
	 * all log level that are less detailed than the one specified. E.g. if
	 * 'info' is the given log level, the list of effective log levels will
	 * contain 'info', 'warn' and 'error'. Thus this method does not return the
	 * mere number of entries for the given log target and level but rather the
	 * number of entries of the given log level and all levels less detailed (or
	 * more severe) than the given one.
	 * 
	 * @param targetName
	 *            The name of the log target
	 * @param level
	 *            The log level (will be transformed into list of effective log
	 *            levels internally)
	 * @return The number of log entries of the given target and the effective
	 *         log levels
	 * @throws LogException
	 *             If reading the log entries of the underlying logger instance
	 *             fails.
	 */
	public int size(String targetName, LogLevel level) throws LogException;

	/**
	 * Returns a list of {@link LogEntry} objects for the given target and
	 * level.
	 * 
	 * The log level is transformed to a list of effective log levels, i.e. the
	 * list of effective log levels contains the given level itself and all log
	 * level that are less detailed than the one specified. E.g. if 'info' is
	 * the given log level, the list of effective log levels will contain
	 * 'info', 'warn' and 'error'. Thus this method does not only return the
	 * entries for the given log target and level but rather the entries of the
	 * given log level and all levels less detailed (or more severe) than the
	 * given one.
	 * 
	 * By specifying a <code>limit</code> the number of entries returned can be
	 * limited to a certain amount. If all log entries are requested
	 * <code>limit</code> must be < 0. By specifying the <code>offset</code>
	 * this amount of log entries will be skipped. Thus the proper use of
	 * <code>offset</code> and <code>limit</code> allows page based reading of
	 * log entries.
	 * 
	 * The log entries are returned in ascending order.
	 * 
	 * @param targetName
	 *            the name of the log target
	 * @param level
	 *            the log level
	 * @param limit
	 *            the number of entries returned or -1 for all log entries
	 * @param offset
	 *            specifies how many entries to skip. Specify 0 to start with
	 *            the first entry.
	 * @param locale
	 *            The locale
	 * @return a list of {@link LogEntry} objects
	 * @throws LogException
	 *             if reading the log entries of the underlying logger instance
	 *             fails.
	 */
	public List<LogEntry> get(String targetName, LogLevel level, int limit, int offset, Locale locale) throws LogException;

	public LogConfiguration getConfiguration();

	public void setConfiguration(LogConfiguration configuration) throws LogException;
}
