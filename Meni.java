package dvadesetidomaci;

public class Meni {
	private int brNamirnica;
	private Namirnica[] nizN;

	public Meni(int brNamirnica) {
		this.brNamirnica = brNamirnica;
		nizN = new Namirnica[brNamirnica];
	}

	public void dodaj(Namirnica n) {
		for (int i = 0; i < nizN.length; i++) {
			if (nizN[i] == null && brNamirnica > 0) {
				nizN[i] = n;
				brNamirnica--;
				break;
			}

		}
	}

	public double ukupnaEnergVr() {
		double sum = 0;
		for (Namirnica namirnica : nizN) {
			if (namirnica == null)
				continue;
			sum += namirnica.energetskaVrednost();
		}
		return sum;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Meni (" + ukupnaEnergVr() + "kJ)\n");
		for (Namirnica namirnica : nizN) {
			if (namirnica == null)
				break;
			sb.append("\t" + namirnica + "\n");
		}
		return sb.toString();
	}

	public Namirnica getNamirnica(int i) {
		return nizN[i];
	}

}
