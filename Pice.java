package dvadesetidomaci;

public class Pice extends Namirnica {
	
	private double kolicina;
	private double energetskaVrednost;

	public Pice(String ime, double kolicina, double enVr) {
		super(ime);
		this.kolicina = kolicina;
		this.energetskaVrednost = energetskaVrednost;
	}

	public double getKolicina() {
		return kolicina;
	}

	public double enVr() {
		return energetskaVrednost * kolicina;
	}

	public String toString() {
		return super.toString() + " (" + kolicina + "l, " + energetskaVrednost() + "kJ)";
	}

	@Override
	public double energetskaVrednost() {
		// TODO Auto-generated method stub
		return 0;
	}
}
	
