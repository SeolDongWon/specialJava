package ch07.exam06seol;

import java.util.Objects;

public class Location {
	private String cityName;
	private int lat;
	private int lon;

	public Location() {
		this(null, 0, 0);
	}

	public Location(String cityName) {
		this(cityName, 0, 0);
	}

	public Location(String cityName, int lat) {
		this(cityName, lat, 0);
	}

	public Location(String cityName, int lat, int lon) {
		super();
		this.cityName = cityName;
		this.lat = lat;
		this.lon = lon;
	}

	public String getCityName() {
		return cityName;
	}

	public int getLat() {
		return lat;
	}

	public int getLon() {
		return lon;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cityName,lat,lon);
	}

	@Override
	public boolean equals(Object obj) {
		Location loc = (Location)obj;
		if(this.cityName.equals(loc.cityName)&&this.lat==loc.lat&&this.lon==loc.lon){
			return true;
		}else {
			return false;
		}		
	}

	@Override
	public String toString() {
		return "" + cityName + "\t" + lat + "\t" + lon;
	}
	
}