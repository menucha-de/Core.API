package havis.util.core.license;

import java.io.InputStream;

import havis.util.core.app.AppInfo;

public interface LicenseCurator {

	License getLicense() throws LicenseException;

	License getLicenseRequest() throws LicenseException;

	void setLicense(InputStream stream) throws LicenseException;

	AppInfo getAppInfo();
}