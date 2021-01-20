package havis.util.core.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/**
 * Remote interface for logging
 */
public interface LogRemote extends Remote {

	void log(LogRecord record) throws RemoteException;

	Map<String, Level> getLevels() throws RemoteException;

}
