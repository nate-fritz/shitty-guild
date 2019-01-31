package shittyguild;

import java.util.Scanner;

public class Application {

	public static Scanner userInput = new Scanner(System.in);
	public static GuildHall newGuildHall = new GuildHall(1, 0);
//	public static GuildBank newGuildBank

	public static void main(String[] args) {

		// Prints out instructions for creating a new adventurer and running a guild.
		System.out.println("Congratulations!  ...I think?  After many years of running the Adventurer's Guild");
		System.out.println("into the ground, your Guild Master has decided to retire.  You have been selected");
		System.out.println("take over as the new Guild Master! You have 10 more years to make this guild ");
		System.out.println("profitable again, or disband the guild entirely.");
		System.out.println("");
		System.out.println("As Guild Master, you will be responsible for sending newest guild members out to help");
		System.out.println("the local townspeople with various tasks, called quests.  Quests reward your guild ");
		System.out.println("members with levels, and reward the guild with gold.");
		System.out.println("");
		System.out.println("Adventurers can only perform quests while they still have enough energy so you will,");
		System.out.println("need to allow them to rest or provide them with potions in order to");
		System.out.println("keep bringing in gold for the guild.");
		System.out.println("");
		System.out.println("You will need gold to buy potions and other supplies for your guild members,");
		System.out.println("but will also need to be careful to ensure the guild bank does not run out of money.");
		System.out.println("Be warned:  the gold supply will slowly deplete due to the various operating costs");
		System.out.println("required to keep your Guild Hall running smoothly.");
		System.out.println("");
		System.out.println("Good luck, Guild Master!");
		System.out.println("");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("Press Enter to start recruiting a new member to the guild.");

		// Begins creation of new adventurer

		// Creation of Adventurer name
		String response = userInput.nextLine().trim();
		if (response.equals("")) {
			System.out.println("What is your new guild member's name?");
		} else {
			System.out.println("Not a valid entry.");
		}

		String name = userInput.nextLine().trim();
		System.out.println("This adventurer is named " + name + "."); // add "is this correct? Y/N" option later.

		// Creation of Adventurer job
		System.out.println("What is this adventurer best at?");
		System.out.println("1. They love to get drunk and start fist fights.  Let's recruit them as Warrior.");
		System.out.println(
				"2. They just finished a Java bootcamp.  Casting spells is probably much easier, let's recruit them as a Wizard.");
		System.out.println(
				"3. They were #1 at cell phone sales in the area for fourteen months straights.  They'd make an excellent Rogue!");
		String userJobChoice = userInput.nextLine().trim();

		while (!userJobChoice.equals("1") && !userJobChoice.equals("2") && !userJobChoice.equals("3")) {
			System.out.println("Not an accepted job, please enter 1, 2, or 3.");
		}

		String userJob = null;

		switch (userJobChoice) {

		case "1":
			userJob = "Warrior";
			break;
		case "2":
			userJob = "Wizard";
			break;
		case "3":
			userJob = "Rogue";
			break;
		}

		Adventurer newRecruit = new Adventurer(name, userJob, 1, 10);
		newGuildHall.addAdventurer(newRecruit);
		System.out.println(
				"Now it's time to welcome " + newRecruit.getName() + ", the " + newRecruit.getJob() + " to the guild!");

		// Begins player Menu - Player can only make choices for 120 months, or 10
		// years. At that point, they win. The game will automatically end if the Guild
		// Bank falls below 0 gold.

		while (newGuildHall.month <= 121 && GuildBank.gold > -1)
			;

		System.out.println("What would you like to do?");
		System.out.println("1. Send the currently selected adventurer on a quest.");
		System.out.println("2. Give the currently selected adventurer a potion.");
		System.out.println("3. Buy another potion.");
		System.out.println("4. Choose another adventurer.");
		System.out.println("5. Recruit a brand new adventurer.");

		String userMenuChoice1 = userInput.nextLine();

		System.out.println(userMenuChoice1);
		switch (userMenuChoice1) {

		case "1":
			newRecruit.quest();
			break;
		case "2":
			newRecruit.drinkPotion();
			break;
		case "3":
			GuildHall.buyPotion();
			break;
		}
	}
}
