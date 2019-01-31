package shittyguild;

import java.util.HashMap;

public class GuildHall {

	public static int month;
	private int year;

	public GuildHall(int year, int month) {
		this.year = month / 12;
		GuildHall.month = month;
	}

	private HashMap<String, Adventurer> adventurerList = new HashMap<String, Adventurer>();

	public void addAdventurer(Adventurer adventurer) {
		adventurerList.put(adventurer.getName(), adventurer);

	}

	public Adventurer findAdventurer(String name) {
		return adventurerList.get(name);
	}

	public void removeAdventurer(Adventurer myGuy) {
		adventurerList.remove(myGuy.getName(), myGuy);

	}

	public int getAdventurerLength() {
		return adventurerList.size();
	}

	public static void buyPotion() {
		GuildBank.gold -= 50;
		GuildBank.potions += 1;
	}

	public int getPotionsLength() {
		return GuildBank.potions;

	}

	public int getGoldLength() {
		return GuildBank.gold;
	}

	public int getMonth() {
		return month;

	}

	public int getYear() {
		return year;
	}
}
