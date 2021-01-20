package havis.util.core.app;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import havis.util.core.license.LicenseState;

public class AppInfo {

	private String name;
	private String label;
	private String path;
	private String version;
	private String[] config;
	private String product;
	private String uuid;
	private String reset;
	private String section;
	private String log;
	private LicenseState license;
	private AppState state;
	@JsonIgnore
	private Set<String> bundles;

	public AppInfo() {
	}

	public AppInfo(String name, String label, String path, String version, String[] config, String product, String uuid) {
		this.name = name;
		this.label = label;
		this.path = path;
		this.version = version;
		this.config = config;
		this.product = product;
		this.uuid = uuid;
	}

	public AppInfo(String name, String label, String path, String version, String[] config, String product, String uuid, String section) {
		this(name, label, path, version, config, product, uuid);
		this.section = section;
	}

	public AppInfo(String name, String label, String path, String version, String[] config, String product, String uuid, String section, AppState state,
			Set<String> bundles) {
		this(name, label, path, version, config, product, uuid, section);
		this.state = state;
		this.bundles = bundles;
	}

	public AppInfo(String name, String label, String path, String version, String[] config, String product, String uuid, String section, String reset,
			String log) {
		this(name, label, path, version, config, product, uuid, section);
		this.reset = reset;
		this.log = log;
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

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String[] getConfig() {
		return config;
	}

	public void setConfig(String[] config) {
		this.config = config;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getReset() {
		return reset;
	}

	public void setReset(String reset) {
		this.reset = reset;
	}

	public LicenseState getLicense() {
		return license;
	}

	public void setLicense(LicenseState license) {
		this.license = license;
	}

	public AppState getState() {
		return state;
	}

	public void setState(AppState state) {
		this.state = state;
	}

	public Set<String> getBundles() {
		return bundles;
	}

	public void setBundles(Set<String> bundles) {
		this.bundles = bundles;
	}

	public String getLog() {
		return log;
	}

	public void setLog(String log) {
		this.log = log;
	}
}