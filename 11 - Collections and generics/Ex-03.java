//based on the methods on the left, determine which of the statements on the right would compile

// takeAnimals(new ArrayList<Dog>()); // DOES NOT COMPILE

// takeDogs(new ArrayList<Animal>()); // DOES NOT COMPILE

// takeAnimals(new ArrayList<Dog>()); // DOES NOT COMPILE

// takeDogs(new ArrayList<>()); // DOES NOT COMPILE

// List<Dog> dogs = new ArrayList<>(); // DOES NOT COMPILE

// takeSomeAnimals(new ArrayList<Dog>()); // COMPILES

// takeSomeAnimals(new ArrayList<Animal>()); // COMPILES

// List<Animal> animals = new ArrayList<>();
// takeSomeAnimals(animals); // COMPILES

// List<Object> objects = new ArrayList<>();
// takeSomeAnimals(objects); // COMPILES

// takeObjects(new ArrayList<Dog>()); // DOES NOT COMPILE

// takeObjects(new ArrayList<Object>()); // COMPILES

private void takeDogs(List<Dog> dogs) {
    
 } 

private void takeAnimals(List<Animal> animals) { }

private void takeSomeAnimals(List<? extends Animal> animals) { }

private void takeObjects(List<Object> objects) { }