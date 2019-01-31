package shittyguild;

public class Adventurer {

	private String name;
	private String job;
	private int level;
	private int energy;

	public Adventurer(String name, String job, int level, int energy) {
		this.name = name;
		this.job = job;
		this.level = level;
		this.energy = 10;

	}

	public String getName() {

		return name;
	}
	
	public String getJob() {
		
		return job;
	}

	public int checkLevel() {
		return level;
	}

	public void quest() {
		if (energy >= 3) {

			level += 1;
			energy -= 3;
			System.out.println(
					"You wander out into the world, and fetch a ridiculous number of seemingly worthless items for a random stranger.  You gain a level!  You are now level "
							+ level + ".");
		} else {
			System.out.println(
					"This adventurer does not have enough energy to seek out a new quest.  Try giving them a potion.");
		}
	}

	public int checkEnergy() {
		return energy;
	}

	public void drinkPotion() {
		if (energy < 10 && GuildBank.potions > 0) {
			energy = 10 + level;
			GuildBank.potions -= 1;
			System.out.println("Your guild member, " + name + "drinks a potion, restoring their energy entirely.");
		} else {
			System.out.println("You do not have any potions available.");

		}

	}
}
