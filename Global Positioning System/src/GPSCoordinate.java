
public class GPSCoordinate {
	private Double latitude = 0.;
	private Double longitude = 0.;

	public  GPSCoordinate(Double latitude, Double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLatitude(){
		return this.latitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLongitude(){
		return this.longitude;
	}

	public void moveTo(Double latitude, Double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String toString() {
		return "(" + latitude + ", " + longitude + ")";
	}

}
