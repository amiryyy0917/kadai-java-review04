package animal;

public class Human extends Animal implements Thinkable {

	private String hobby;

	public Human() {

	}

	public Human(String name,int age,String hobby) {

		super.setName(name);
		super.setAge(age);
		this.hobby=hobby;

	}

	@Override

	public void say() {

		System.out.println(getName()+"です。"+getAge()+"歳です。");
	}




	public void think() {

		System.out.println("私は"+this.hobby+"について考えています。");

	}


	public String getHobby() {

		return hobby;
	}

	public void sestHobby(String hobby) {

		this.hobby=hobby;
	}


}
