package de.uni.koeln.sse.se;

public class PackageVisitor implements Visitor {
	 @Override
	    public String visit(Electronic electronic) {
	        return electronic.getName() + ":\n" + ">should be covered in Polyethylene and packed in a box with dimension: " + (electronic.getLenght() + 1) + "x" + (electronic.getWidth() + 1) + "x" + (electronic.getHeight() + 1);
	    }

	    @Override
	    public String visit(Glass glass) {
	        return glass.getName() + ":\n" + ">should be wrapped with Bubble Wraps and packed in a box with dimension: " + (glass.getlenght() + 1) + "x" + (glass.getWidth() + 1) + "x" + (glass.getHeight() + 1);
	    }

	    @Override
	    public String visit(Furniture furniture) {
	        return furniture.getName() + ":\n" + ">should be covered with waterproof covers with are of: " + (furniture.getLenght() + 1) + "x" + (furniture.getWidth() + 1) + "x" + (furniture.getHeight() + 1);
	    }
	    
	}

