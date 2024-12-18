
public class Character {

	public String name;
	public int hp;
	public int offense;
	public int defense;

	public Character() {

	}

	public Character(String name,int hp,int offense,int defense) {

		this.name=name;
		this.hp=hp;
		this.offense=offense;
		this.defense=defense;

	}


	public void attack(Character opponent) {

		int damage=this.offense-this.defense;

		if(damage>0) {

			opponent.hp=opponent.hp-damage;
			System.out.println(this.name+"は"+opponent.name+"に"+damage+"を与えた！");

		}else {

			System.out.println("ミス！"+this.name+"は"+opponent.name+"にダメージを与えられない！");



		}
	}


}
