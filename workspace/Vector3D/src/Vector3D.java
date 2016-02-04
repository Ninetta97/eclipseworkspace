//

public class Vector3D {
	
	private double x;
	private double y;
	private double z;
	
	
	public Vector3D(double x, double y, double z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double getR(){
	//return radical distance r
		double r = Math.sqrt(x*x + y*y + z*z);
		return r;
		
	}
	
	public double getTheta(){
		//return the inclination theta with respect to the zith
		double theta = Math.acos(z/(getR()));
		return theta;
	
	}
	
	public double getPhi(){
		//return the azimut angle
		double phi = Math.atan2(y, x); 
				//atan2 = the 4 quadrant version of the tangent
		return phi;

	}
	
	public double getx(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public double getZ(){
		return z;
	}
	
	public static Vector3D add(Vector3D lhs, Vector3D rhs){
		//static hence a CLASS method - i.e. it's a method applied
		//within the class not specified to a certain object
		double xvalue = lhs.getx() + rhs.getx();
		double yvalue = lhs.getY() + rhs.getY();
		double zvalue = lhs.getZ() + rhs.getZ();
		Vector3D sumVector = new Vector3D( xvalue, yvalue, zvalue);
		return sumVector;
	}
	
	public static Vector3D subtract(Vector3D lhs, Vector3D rhs){
		//return difference of two 3d vectors
		double xvalue = lhs.getx() - rhs.getx();
		double yvalue = lhs.getY() - rhs.getY();
		double zvalue = lhs.getZ() - rhs.getZ();
		Vector3D diffVector = new Vector3D( xvalue, yvalue, zvalue);
		return diffVector;
		
	}
	
	public static Vector3D scale(Vector3D v, double scaleFactor){
		//return the result of scaling v by scalefactor
		//i.e. multiply the vecotr by a scalar
		double xvalue = v.getx() * scaleFactor;
		double yvalue = v.getY() * scaleFactor;
		double zvalue = v.getZ() * scaleFactor;
		Vector3D scaled = new Vector3D(xvalue, yvalue, zvalue);
		return scaled;
		
		
	}
	
	
	

}
