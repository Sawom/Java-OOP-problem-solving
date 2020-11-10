package problemShape;
public abstract class shape {
	public double dim1;
	public double dim2;
	
	shape(double dim1,double dim2){
		this.dim1=dim1;
		this.dim2=dim2;
	}
	
	abstract void area();
}
