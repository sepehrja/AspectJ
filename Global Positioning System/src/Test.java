
public class Test {
	public static void main(String[] args) {
		

		GPSCoordinate point = new GPSCoordinate(45.220227, -73.564453);
		point.moveTo(46.763321, -71.224365);
		System.out.println(point.getLatitude());
		System.out.println(point.getLongitude());
		System.out.println(point.toString());
	
		
	}

}
