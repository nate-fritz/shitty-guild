package shittyguild;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AdventurerTest {

	Adventurer underTest = new Adventurer("myGuy", "unknown", 1, 10);

	@Test
	public void shouldGainLevel() {
		// Tests the quest() method in Adventurer
		// Arrange - already declared
		// Act
		int originalLevel = underTest.checkLevel();
		underTest.quest();
		int newLevel = underTest.checkLevel();
		// Assert
		assertEquals(originalLevel + 1, newLevel);
	}

	@Test
	public void shouldConsumeEnergy() {
		// Tests quest()
		// Arrange
		// Act
		int originalEnergy = underTest.checkEnergy();
		underTest.quest();
		int newEnergy = underTest.checkEnergy();
		// Assert
		assertEquals(originalEnergy - 3, newEnergy);
	}

	@Test
	public void shouldDrinkPotion() {
		// Tests drinkPotion()
		// Act
		underTest.quest();
		underTest.drinkPotion();
		int newEnergy = underTest.checkEnergy();
		assertEquals(newEnergy, 10);

	}
	
	@Test
	public void shouldDecreaseGuildPotionsByOne() {
		// Tests drinkPotion()
		// Act
		underTest.drinkPotion();
		int newEnergy = underTest.checkEnergy();
		assertEquals(newEnergy, 10);

	}

	@Test
	public void shouldSlowDown() {
		// Tests the brake() method in Car
		// Arrange
		// Act
		// Assert
	}

	@Test
	public void shouldStart() {
		// Tests toggleEngine()
	}

	@Test
	public void shouldTurnOff() {
		// Tests toggleEngine()
	}

}
