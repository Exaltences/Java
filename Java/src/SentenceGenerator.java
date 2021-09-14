/*
 * Ares Ton-That
 * This program is designed to randomly create sentences.
 */

public class SentenceGenerator {

	public static void main(String[] args) {

		String[] nouns = nouns();
		String[] verbs = verbs();
		String[] adjectives = adjectives();
		String[] prepositions = prepositions();
		String[] articles = articles();

		createSentences(nouns, verbs, adjectives, prepositions, articles);
	}

	public static String[] nouns() {

		String[] nouns = { "People", "History", "Way", "Art", "World", "Information", "Iniquity", "Family",
				"Government", "Health", "System", "Computer", "Meat", "Year", "Music", "Method", "Data", "Food",
				"Theory", "Law", "Bird", "Animal", "Literature", "Problem", "Software", "Control", "Power", "Knowledge",
				"Ability", "Television" };

		return nouns;

	}

	public static String[] verbs() {

		String[] verbs = { "Accept", "Acknowlege", "Add", "Admire", "Admit", "Admonish", "Adopt", "Affirm", "Avoid",
				"Babble", "Bake", "Bathe", "Believe", "Calculate", "Challenge", "Change", "Check", "Damage", "Delay",
				"Deliver", "Earn", "Eat", "Feel", "Force", "Forget", "Give", "Grab", "Harm", "Hate", "Hinder" };

		return verbs;
	}

	public static String[] adjectives() {

		String[] adjectives = { "Accurate", "Acidic", "Acrobatic", "Admirable", "Affectionate", "Aggravating",
				"Alarming", "Aggressive", "Agonizing", "Beautiful", "Beneficial", "Biodegradable", "Bland", "Bleak",
				"Blissful", "Calm", "Candid", "Cool", "Cooperative", "Dangerous", "Dazzling", "Deafening",
				"Descriptive", "Drafty", "Elaborate", "Exemplary", "Excitable", "Experienced", "Impure", "Inferior" };

		return adjectives;
	}

	public static String[] prepositions() {

		String[] prepositions = { "With", "At", "From", "Into", "During", "Including", "Until", "Against", "Among",
				"Upon", "Concerning", "Despite", "On", "About", "Like", "Through", "Between", "Before", "After",
				"Along" };

		return prepositions;
	}

	public static String[] articles() {

		String[] articles = { "A", "The" };

		return articles;
	}

	public static void createSentences(String[] nouns, String[] verbs, String[] adjectives, String[] prepositions,
			String[] articles) {

		for (int i = 0; i < 7; i++) {

			int randomArticle1 = (int) (Math.random() * 1) + 1;
			int randomArticle2 = (int) (Math.random() * 1) + 1;
			int randomAdjective1 = (int) (Math.random() * 29) + 1;
			int randomAdjective2 = (int) (Math.random() * 29) + 1;
			int randomNoun1 = (int) (Math.random() * 29) + 1;
			int randomNoun2 = (int) (Math.random() * 29) + 1;
			int randomVerb = (int) (Math.random() * 29) + 1;
			int randomPreposition = (int) (Math.random() * 19) + 1;
			System.out.println(articles[randomArticle1] + " " + adjectives[randomAdjective1] + " " + nouns[randomNoun1]
					+ " " + verbs[randomVerb] + " " + prepositions[randomPreposition] + " " + articles[randomArticle2]
					+ " " + adjectives[randomAdjective2] + " " + nouns[randomNoun2]);
		}
	}

}