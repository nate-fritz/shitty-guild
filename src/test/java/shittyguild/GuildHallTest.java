package shittyguild;

import org.junit.Test;

public class GuildHallTest {

	GuildHall underTest = new GuildHall();
	@Test
	public void shouldAddAdventurerToGuildHall() {
		// Tests addAdventurer()
		underTest.addAdventurer(myGuy);
		Adventurer foundAdventurer = underTest.findAdventurer(myGuy.getName());
		assertEquals("1", foundAdventurer.getName());
	}
	
	@Test
	public void shouldRemoveAdventurerToGuildHall() {
		// Tests removeAdventurer()
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
