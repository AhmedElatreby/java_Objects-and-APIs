package polymorphism;

public class Zoo {

    public static void main(String[] args) {
        Dog molley = new Dog();
        molley.fetch();
        molley.makeSound();

        Cat catly = new Cat();
        catly.makeSound();
        catly.scratch();

        Animal catlly = new Cat();
        catlly.makeSound();

        Animal snowy = new Cat();
        snowy.makeSound();
        // typecasting
        ((Cat)snowy).scratch();

        snowy = new Dog();
        snowy.makeSound();

    }
}
