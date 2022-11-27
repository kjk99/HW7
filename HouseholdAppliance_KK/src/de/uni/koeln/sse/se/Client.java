package de.uni.koeln.sse.se;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client{
	
public static void main(String[] args) {
		

		//Initialise some household
		List<HouseholdItem> householdItems= new ArrayList<>();

		
		Electronic microwaveOven= new Electronic("Microwave Oven",37, 48, 27, 13, false);
		Electronic tv= new Electronic("TV",122, 73, 15, 18, true);
		
		Glass wineGlass= new Glass("Wine glasses",33,28,23,1);
		Glass coffeeTable= new Glass("Glass Coffee Table ",80,80,45,3);

		
		Furniture bed= new Furniture("Bed", "Metal", 205, 91, 94, 26);
		Furniture cupboard= new Furniture("Bookshelf", "Wood", 60, 31, 190, 25);
		
		
        List<HouseholdItem> namesList = Arrays.asList(microwaveOven,tv,wineGlass,coffeeTable,bed,cupboard );
        householdItems.addAll(namesList);
        

		
//Calculate the cost of the household
		CostVisitor costVisitor= new CostVisitor();
		PackageVisitor packageVisitor= new PackageVisitor();

		//Task 2:
		System.out.println(microwaveOven.accept(costVisitor));
		System.out.println(tv.accept(costVisitor));
		System.out.println(wineGlass.accept(costVisitor));
		System.out.println(coffeeTable.accept(costVisitor));
		System.out.println(bed.accept(costVisitor));
		System.out.println(cupboard.accept(costVisitor));

		//Task 3:
		System.out.println(microwaveOven.accept(packageVisitor));
		System.out.println(tv.accept(packageVisitor));
		System.out.println(wineGlass.accept(packageVisitor));
		System.out.println(coffeeTable.accept(packageVisitor));
		System.out.println(bed.accept(packageVisitor));
		System.out.println(cupboard.accept(packageVisitor));


	}
}