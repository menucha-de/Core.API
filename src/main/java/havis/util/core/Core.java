package havis.util.core;

import havis.util.core.app.AppCurator;
import havis.util.core.log.LogCurator;
import havis.util.core.rmi.ProcessHandler;

public interface Core {

	AppCurator getApp();

	LogCurator getLog();
	
	ProcessHandler getRmi();
}