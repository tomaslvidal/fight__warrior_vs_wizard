public class warrior {

	private String nombre;
	private int hp;
	private int mp;
	private int dp;
	private skill habilidad;

	public warrior(String nombre){
		this.nombre = nombre;
		this.hp = 270+(int)((Math.random()*70)+1);
		this.mp = 100+(int)((Math.random()*30)+1);
		this.dp = 25+(int)((Math.random()*25)+1);
		int suma = hp+mp+dp;
		if(suma%2==0){
			habilidad = new skill("Furia",40,40);
		}else{
			habilidad = new skill("Embestida",35,30);
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

	public int atacar(wizard mago){
		int vidaActual = mago.getHp()-dp;
		mago.setHp(vidaActual);
		return vidaActual;
	}

	public int usarSkill(wizard mago){
		int vidaActual = mago.getHp()-habilidad.getDh();
		mago.setHp(vidaActual);
		return vidaActual;
	}

}
