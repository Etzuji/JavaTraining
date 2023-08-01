public class Person implements Comparable<Person> {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        String text = "Hallo! Mein Name ist ";
        text += getName() + " und ich bin ";
        text += getAge() + " Jahre alt!";
        return text;
    }

    public boolean equals(Object o) {
        if (o == null)
            return false;

        if (!(o instanceof Person p))
            return false;

        return p.getName().equals(getName()) && p.getAge() == getAge();
    }

    public int compareTo(Person p) {
        if (getAge() > p.getAge())
            return -1;
        else if (getAge() < p.getAge())
            return 1;
        else
            return 0;
    }

    public static int compareTo(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }
}