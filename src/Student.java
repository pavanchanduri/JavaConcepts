public record Student(int rollNumber, String name) {

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student other) {
            return this.rollNumber == other.rollNumber;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.rollNumber + this.name.hashCode();
    }

}
