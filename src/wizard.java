public class wizard {

	private String nombre;
	private int hp;
	private int mp;
	private int dp;
	private skill habilidad;

	public wizard(String nombre){
		this.nombre = nombre;
		this.hp = 200+(int)((Math.random()*50)+1);
		this.mp = 250+(int)((Math.random()*50)+1);
		this.dp = 10+(int)((Math.random()*15)+1);
		int suma = hp+mp+dp;
		if(suma%2==0){
			habilidad = new skill("Helada invernal",45,30);
		}else{
			habilidad = new skill("Tormenta de fuego",50,40);
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getDp() {
		return dp;
	}

	public void setDp(int dp) {
		this.dp = dp;
	}

	public skill getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(skill habilidad) {
		this.habilidad = habilidad;
	}

	public int atacar(warrior guerrero){
		int vidaActual = guerrero.getHp()-dp;
		guerrero.setHp(vidaActual);
		return vidaActual;
	}

	public int usarSkill(warrior guerrero){
		int vidaActual = guerrero.getHp()-habilidad.getDh();
		this.mp = mp - habilidad.getMp();
		guerrero.setHp(vidaActual);
		return vidaActual;
	}

}
