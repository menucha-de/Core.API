package havis.util.core.app;

import havis.util.core.license.License;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;

public interface AppCurator {

	boolean isStarted();

	void install(String name, InputStream stream) throws AppException;

	void remove(String name) throws AppException;

	void plug(String filename) throws AppException;

	void unplug(String filename) throws AppException;

	Collection<AppInfo> get();

	AppState getState(String name) throws AppException;

	void setState(String name, AppState state) throws AppException;

	void getConfig(String name, OutputStream stream) throws AppException;

	void setConfig(String name, InputStream stream) throws AppException;

	void resetConfig(String name) throws AppException;

	License getLicenseRequest(String name) throws AppException;

	License getLicense(String name) throws AppException;

	void setLicense(String name, InputStream stream) throws AppException;

	Collection<String> getBackups(String name) throws AppException;

	void storeBackup(String name, String label) throws AppException;

	void restoreBackup(String name, String label) throws AppException;

	void dropBackup(String name, String label) throws AppException;
}