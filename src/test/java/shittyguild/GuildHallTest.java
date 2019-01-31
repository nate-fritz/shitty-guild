package shittyguild;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GuildHallTest {

	GuildHall underTest = new GuildHall(0, 1);
	Adventurer myGuy = new Adventurer("Sinogue", "unknown", 1, 10);

	@Test
	public void shouldAddAdventurerToGuildHall() {
		// Tests addAdventurer()
		underTest.addAdventurer(myGuy);
		Adventurer foundAdventurer = underTest.findAdventurer(myGuy.getName());
		assertEquals("Sinogue", foundAdventurer.getName());
	}

	@Test
	public void shouldRemoveAdventurerToGuildHall() {
		// Tests removeAdventurer()
		underTest.addAdventurer(myGuy);
		int initialAdvs = underTest.getAdventurerLength();
		underTest.removeAdventurer(myGuy);
		int advsAfterAddition = underTest.getAdventurerLength();

		assertEquals(initialAdvs - 1, advsAfterAddition); // Check to see that there is one fewer adventurer in the
															// list.
	}
	
	@Test
	public void shouldIncreasePotionsByOne() {
		// Tests buyPotion()
		int initialPotions = underTest.getPotionsLength();
		underTest.buyPotion();
		int potionsAfterPurchase = underTest.getPotionsLength();
		
		assertEquals(initialPotions +1, potionsAfterPurchase);
	}

	
	@Test
	public void shouldDecreaseGoldBy50() {
		// Tests buyPotion()
		int initialGold = underTest.getGoldLength();
		underTest.buyPotion();
		int goldAfterPurchase = underTest.getGoldLength();
		
		assertEquals(initialGold -50, goldAfterPurchase);
	}
		

	@Test
	public void shouldRestoreEnergyToAllAdventurers() {
		// Tests potionAll()
	}

	@Test
	public void shouldTestDriveOneCar() {
		// Tests driveCar()
		// Should select a single car
		// **APPLICATION** should then let you choose what to do with that car
	}

	@Test
	public void _createTestName_() {
		// Should be able to list stats of all cars
		// create necessary method(s)
		// GARAGE should provide cars
		// APPLICATION should list all stats
	}
}
