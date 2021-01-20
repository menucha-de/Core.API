package havis.util.core.license;

public class License {

	private String licensee;
	private String product;
	private String serial;

	public License() {
	}

	public License(String product, String serial) {
		this.product = product;
		this.serial = serial;
	}

	public String getLicensee() {
		return licensee;
	}

	public void setLicensee(String licensee) {
		this.licensee = licensee;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}
}