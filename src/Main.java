class Animal {
    String food;
    String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Such an animal is sleeping");
    }

    public void eat() {
        System.out.println("Animal is eating " + food);
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    String breed;

    public Dog(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }


    public void makeNoise() {
        System.out.println("Dog is barking");
    }


    public void eat() {
        System.out.println("Dog is eating " + food);
    }
}

class Cat extends Animal {
    String color;

    public Cat(String food, String location, String color) {
        super(food, location);
        this.color = color;
    }


    public void makeNoise() {
        System.out.println("Cat is meowing");
    }


    public void eat() {
        System.out.println("Cat is eating " + food);
    }
}

class Horse extends Animal {
    String breed;

    public Horse(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }


    public void makeNoise() {
        System.out.println("Horse is neighing");
    }


    public void eat() {
        System.out.println("Horse is eating " + food);
    }
}

class Veterinary {
    public void treatAnimal(Animal animal) {
        System.out.println("Food: " + animal.food + ", Location: " + animal.location);
    }
}

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("корм собачий", "будка собаки", "Бульдог");
        animals[1] = new Cat("корм кошачий", "Зал", "Серый");
        animals[2] = new Horse("Зерно", "Конюшня", "Thoroughbred");

        Veterinary vet = new Veterinary();

        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }
    }
}
