package com.palani2code.demo;

public class CricketCoach implements Coach {
	FortuneService fortune;
	public CricketCoach(FortuneService theFortune){
		fortune = theFortune;
	}

	@Override
	public String getDailyWorkout() {
		return "Work out time at 6AM";
	}

	@Override
	public String getDailyFortune() {
		return fortune.getFortune();
	}

}
