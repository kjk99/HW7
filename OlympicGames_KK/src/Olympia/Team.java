package Olympia;

public class Team implements OlympiaTeam {
	 private String name;
	    private int nrOfAthletes;
	    private int nrOfGoldMedals;

	    public Team(String name, int nrOfAthletes, int nrOfGoldMedals) {
	        this.name = name;
	        this.nrOfAthletes = nrOfAthletes;
	        this.nrOfGoldMedals = nrOfGoldMedals;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getNrOfAthletes() {
	        return nrOfAthletes;
	    }

	    public void setNrOfAthletes(int nrOfAthletes) {
	        this.nrOfAthletes = nrOfAthletes;
	    }

	    public int getNrOfGoldMedals() {
	        return nrOfGoldMedals;
	    }

	    public void setNrOfGoldMedals(int nrOfGoldMedals) {
	        this.nrOfGoldMedals = nrOfGoldMedals;
	    }

	    @Override
	    public void printNrOfAthletes() {
	        System.out.println("Team: " + this.name + " -> " + "Number of Athletes: " + this.nrOfAthletes);
	    }

	    @Override
	    public void printNrOfGoldMedals() {
	        System.out.println("Team: " + this.name + " -> " + "Number of GoldMedals " + this.nrOfGoldMedals);
	    }
}
