public class Person {
    private String name;

    public String getName(String name) {
//        this.name = name;
//TODO: return the person's name
        return name;
    }

    public void setName(String name) {
//TODO: change the name field to the passed value
        this.name = name;
    }

    public void sayHello() {
//TODO: print a message to the console using the person's name
        System.out.format("Hello from: " + this.name);
    }


    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Jose");
        person1.sayHello();
    }

}
