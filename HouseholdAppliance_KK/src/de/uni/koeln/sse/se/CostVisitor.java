package de.uni.koeln.sse.se;

public class CostVisitor implements Visitor {
	 @Override
	    public String visit(Electronic electronic) {
	        if (electronic.getFragile() == true) {
	            return "Total cost for " + electronic.getName() + " is: " + 0.5 * electronic.getWeight();
	        } else {
	            return "Total cost for " + electronic.getName() + " is: " + 0.333333333333333333333333333333333333333333333333333333 * electronic.getWeight();
	        }
	    }

	    @Override
	    public String visit(Glass glass) {
	        if (glass.gettickness() == 1) {
	            return "Total cost for " + glass.getName() + " is: " + 0.02 * glass.getlenght();
	        } else if (glass.gettickness() == 2) {
	            return "Total cost for " + glass.getName() + " is: " + 0.012 * glass.getlenght();
	        } else {
	            return "Total cost for " + glass.getName() + " is: " + 0.007 * glass.getlenght();
	        }
	    }

	    @Override
	    public String visit(Furniture furniture) {
	        return "Total cost for " + furniture.getName() + " is: " + 0.25 * furniture.getWeight();
	    }

	}

