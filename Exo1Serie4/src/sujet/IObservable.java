package sujet;

public interface IObservable {
	public int getPrecision();
	public void setMesures(double position[], int precision);
	public double[] getPosition();

}
