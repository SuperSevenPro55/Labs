package Classes;

public record Student(String name, int age) implements Comparable<Student> {

    @Override
    public int compareTo(Student other) {
        if (this.age() != other.age()) {
            return Integer.compare(this.age(), other.age());
        }
        return this.name().compareTo(other.name());
    }

    @Override
    public String toString() {
        return this.name() + ' ' + this.age();
    }
}