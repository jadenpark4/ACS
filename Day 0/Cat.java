public class Cat { // 1. Made 'Public' lowercase to 'public' 2. changed "Cats" to "Cat"
	private String name;
	private String breed;
	private boolean isHungry;
	private int livesRemaining;
	
	// 2-Parameter Constructor
	public Cat(String name, String breed) { //3. Capitalized constructor name 'cat' to 'Cat' 4. added parameter breed with String data type
		this.name = name;
		this.breed = breed;
		this.isHungry = true; // 4. changed 'yes' to 'true'
		livesRemaining = 9;
	}

	public String getName() { // 5. changed the returning data type from 'void' to 'String'
		return name;
	}

	public String getBreed() { // 19. Added getBreed
		return breed;
	}

	public void setBreed(String breed) { // 20. Added setBreed
		this.breed = breed;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getIsHungry(){ // 6. changed the returning data type from 'void' to 'boolean' // 18. Camel case for "getIsHungry"
		return isHungry;
	}
 
	public void setIsHungry(boolean isHungry) { // 21. Added setIsHungry
		this.isHungry = isHungry;
	}

	public int getLivesRemaining(){ // 22. Added getLivesRemaining
		return livesRemaining;
	}
 
	public void setLivesRemaining(int livesRemaining) { // 21. Added setLivesRemaining
		this.livesRemaining = livesRemaining;
	}


	public boolean feed() { // 7. Changed the method name from "feed" to "getIsHungry", to match the method called from the tester
		this.isHungry = false;
		return isHungry; // 8. Return the boolean value of "isHungry"
	}

	public boolean equals(Cat other) {
		if (this.name.equals(other.name) && this.breed.equals(other.breed) && this.isHungry == other.isHungry // 25. added this and other for isHungry	26. used .equals for finding equivalence in name
			&& this.livesRemaining == other.livesRemaining) {
				return true; // 23. added return true
			} else {
				return false; // 24. added return flase
		} // 9. two equals signs instead of one, for comparing quantitative values
	}

	public String toString() {
		return name + " is of breed " + breed + " and has " + livesRemaining + " lives remaining."; // 10. Instead of printing this line, we return this sentence as a String.
	}
}
