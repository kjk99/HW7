package Olympia;

import java.util.ArrayList;

public class CompositeOlympiaTeam implements OlympiaTeam {
	
	 private String name;
	    private ArrayList<OlympiaTeam> children;


	    public CompositeOlympiaTeam(String name) {
	        this.children = new ArrayList<OlympiaTeam>();
	        this.name = name;
	    }

	    public void addChild(OlympiaTeam child) {
	        this.children.add(child);

	    }

	    public void removeChild(OlympiaTeam child) {
	        children.remove(child);
	    }

	    public ArrayList<OlympiaTeam> getChildren() {
	        return children;
	    }

	    public void setChildren(ArrayList<OlympiaTeam> children) {
	        this.children = children;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    @Override
	    public void printNrOfAthletes() {
	        System.out.println(this.name);
	        for (OlympiaTeam t : children) {
	            t.printNrOfAthletes();
	        }
	    }

	    @Override
	    public void printNrOfGoldMedals() {
	        System.out.println(this.name);
	        for (OlympiaTeam t : children) {
	            t.printNrOfGoldMedals();
	        }
	    }
}
