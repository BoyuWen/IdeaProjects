package main;
import animal.*;

public class run {
	public static void main(String[] args){
		Person me = new Person();
		Cat cat = new Cat();
		Dog dog = new Dog();
		Elephant elephant = new Elephant();
		Food fish = new Food("”„");
		Food meat = new Food("»‚");
		Food banana = new Food("œ„Ω∂");
		me.feed(cat,fish);
		me.feed(dog,meat);
		me.feed(elephant,banana);
	}
}
