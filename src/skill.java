public class skill {

	private String habilidad;
	private int dh;
	private int mp;

	public skill(String habilidad, int dh, int mp){
		this.habilidad = habilidad;
		this.dh = dh;
		this.mp = mp ;
		int suma = mp+dh;
	}

	public String getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}

	public int getDh() {
		return dh;
	}

	public void setDh(int dh) {
		this.dh = dh;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

}
