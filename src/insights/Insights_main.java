package insights;

import com.ibm.watson.developer_cloud.personality_insights.v3.PersonalityInsights;

public class Insights_main {
	public static void main(String[] args) {
		PersonalityInsights service = new PersonalityInsights("2016-10-19");
		service.setUsernameAndPassword("J16009", "J16009");

		String comment = "Call me Ishmael. Some years ago-never mind how long "
				+ "precisely-having little or no money in my purse, and nothing "
				+ "particular to interest me on shore, I thought I would sail about "
				+ "a little and see the watery part of the world. It is a way "
				+ "I have of driving off the spleen and regulating the circulation. "
				+ "Whenever I find myself growing grim about the mouth; whenever it "
				+ "is a damp, drizzly November in my soul; whenever I find myself "
				+ "involuntarily pausing before coffin warehouses, and bringing up "
				+ "the rear of every funeral I meet; and especially whenever my "
				+ "hypos get such an upper hand of me, that it requires a strong "
				+ "moral principle to prevent me from deliberately stepping into "
				+ "the street, and methodically knocking people's hats off-then, "
				+ "I account it high time to get to sea as soon as I can.";

		Insights_lib insights_lib = new Insights_lib();
		insights_lib.getProfile(comment);
	}

}

