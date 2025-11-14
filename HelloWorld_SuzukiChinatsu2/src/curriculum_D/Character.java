package curriculum_D;


public class Character {
	private String playerName;
	private int hp;
	private int at;
	private int sp;

	public Character(String pName, int hp, int at, int sp) {
		this.playerName = pName;
		this.hp = hp;
		this.at = at;
		this.sp = sp;

	}

	public String getPlayerName() {
		return playerName;
	}


	public int getHp() {
		return hp;
	}


	public int getAt() {
		return at;
	}

	
	public int getSp() {
		return sp;
	}

	 public void damage(int amount) {
	        this.hp -= amount;
	        if (this.hp < 0) this.hp = 0;
	    }
	
}
