package task5;

import java.util.Objects;

public class Animal {
    String name;
    int age;
    boolean tail;
    String hvost;


    public Animal(String name, int age, boolean tail){
        this.name = name;
        this.age = age;
        this.tail = tail;

        if (tail == true){
            String hvost  = "Have tail";
            this.hvost = hvost;
        }else {
            String hvost = "Don't have tail";
            this.hvost = hvost;
        }
    }

    @Override
    public String toString() {
        return "Name - " + name + "\nAge - " + age + "\nTail - " + hvost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && tail == animal.tail && name.equals(animal.name) && hvost.equals(animal.hvost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, tail, hvost);
    }
}
