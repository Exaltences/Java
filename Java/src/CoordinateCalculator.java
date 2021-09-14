/*
 * Ares Ton-That
 * This program is designed to compute the area between the four cities of
 * Atlanta, Georgia, Charlotte, North Carolina, Savannah, Georgia, and 
 * Orlando, Florida.
 */

public class CoordinateCalculator {

	public static void main(String[] args) {
		
		//Create constants to store the coordinates of the cities.
		final double ATLANTA_LATITUDE = Math.toRadians(33.7489954);
		final double ATLANTA_LONGITUDE = Math.toRadians(-84.3879824);
		final double CHARLOTTE_LATITUDE = Math.toRadians(35.2270869);
		final double CHARLOTTE_LONGITUDE = Math.toRadians(-80.84312669999997);
		final double ORLANDO_LATITUDE = Math.toRadians(28.5383355);
		final double ORLANDO_LONGITUDE = Math.toRadians(-81.37923649999999);
		final double SAVANNAH_LATITUDE = Math.toRadians(32.0835407);
		final double SAVANNAH_LONGITUDE = Math.toRadians(-81.09983419999998);
		final double radiusOfEarth = 6371.01;
				
		//Calculate the distance between the cities.
		double distanceBetweenAtlantaAndCharlotte = radiusOfEarth *
				( Math.acos( (Math.sin(ATLANTA_LATITUDE) * Math.sin(CHARLOTTE_LATITUDE)) +
				( Math.cos(ATLANTA_LATITUDE) * Math.cos(CHARLOTTE_LATITUDE) * 
				( Math.cos(ATLANTA_LONGITUDE - CHARLOTTE_LONGITUDE) ) ) ) );
		
		double distanceBetweenCharlotteAndSavannah = radiusOfEarth * 
				( Math.acos( (Math.sin(CHARLOTTE_LATITUDE) * Math.sin(SAVANNAH_LATITUDE)) +
				( Math.cos(CHARLOTTE_LATITUDE) * Math.cos(SAVANNAH_LATITUDE) * 
				( Math.cos(CHARLOTTE_LONGITUDE - SAVANNAH_LONGITUDE) ) ) ) );
		
		double distanceBetweenOrlandoAndSavannah = radiusOfEarth * 
				( Math.acos( (Math.sin(ORLANDO_LATITUDE) * Math.sin(SAVANNAH_LATITUDE)) +
				( Math.cos(ORLANDO_LATITUDE) * Math.cos(SAVANNAH_LATITUDE) * 
				( Math.cos(ORLANDO_LONGITUDE - SAVANNAH_LONGITUDE) ) ) ) );
		
		double distanceBetweenOrlandoAndAtlanta = radiusOfEarth * 
				( Math.acos( (Math.sin(ORLANDO_LATITUDE) * Math.sin(ATLANTA_LATITUDE)) +
				( Math.cos(ORLANDO_LATITUDE) * Math.cos(ATLANTA_LATITUDE) * 
				( Math.cos(ORLANDO_LONGITUDE - ATLANTA_LONGITUDE) ) ) ) );
		
		double distanceBetweenAtlantaAndSavannah = radiusOfEarth * 
				( Math.acos( (Math.sin(ATLANTA_LATITUDE) * Math.sin(SAVANNAH_LATITUDE)) +
				( Math.cos(ATLANTA_LATITUDE) * Math.cos(SAVANNAH_LATITUDE) * 
				( Math.cos(ATLANTA_LONGITUDE - SAVANNAH_LONGITUDE) ) ) ) );
		System.out.println(distanceBetweenAtlantaAndCharlotte);
		System.out.println(distanceBetweenCharlotteAndSavannah);
		System.out.println(distanceBetweenOrlandoAndSavannah);
		System.out.println(distanceBetweenOrlandoAndAtlanta);
		System.out.println(distanceBetweenAtlantaAndSavannah);
		
		//Create formulas for s of the two triangles.
		double s1 = (distanceBetweenAtlantaAndCharlotte + 
					 distanceBetweenCharlotteAndSavannah +
					 distanceBetweenAtlantaAndSavannah) / 2;
		
		double s2 = (distanceBetweenOrlandoAndAtlanta + 
					 distanceBetweenOrlandoAndSavannah +
					 distanceBetweenAtlantaAndSavannah) / 2;
		
		double triangle1Area = Math.sqrt(s1 * (s1 - distanceBetweenAtlantaAndCharlotte) * 
				(s1 - distanceBetweenCharlotteAndSavannah) * 
				(s1 - distanceBetweenAtlantaAndSavannah));
		
		double triangle2Area = Math.sqrt(s2 * (s2 - distanceBetweenOrlandoAndAtlanta) *
				(s2 - distanceBetweenOrlandoAndSavannah) * 
				(s2 - distanceBetweenAtlantaAndSavannah));
		
		double polygonArea = triangle1Area + triangle2Area;
		double polygonAreaRounded = Math.round(polygonArea * 10000) / 10000.0; 
		
		System.out.println("The area of the four cities is: " + polygonAreaRounded + 
				" kms squared.");
		
	}

}