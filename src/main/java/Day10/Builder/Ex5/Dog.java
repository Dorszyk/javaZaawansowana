package Day10.Builder.Ex5;

import java.util.List;

public class Dog {

    private String name;
    private String type;
    private Integer age;
    private List<String> toys;

    private Dog() {

    }

    public static class DogBuilder {
        private String name;
        private String type;
        private Integer age;
        private List<String> toys;


        public DogBuilder name(String name) {
            this.name = name;
            return this;
        }

        public DogBuilder type(String type) {
            this.type = type;
            return this;
        }

        public DogBuilder age(int age) {
            this.age = age;
            return this;
        }

        public DogBuilder toys(List<String> toys) {
            this.toys = toys;
            return this;
        }

        public Dog build() {
            Dog dog = new Dog();
            dog.name = this.name;
            dog.type = this.type;
            dog.age = this.age;
            dog.toys =this.toys;

            return dog;

        }

    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                ", toys=" + toys +
                '}';
    }
}
