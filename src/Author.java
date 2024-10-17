public class Author {
    private String fName;
    private String lName;
    private int year;

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Author{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", year=" + year +
                '}';
    }

    public Author(String fName, String lName, int year) {
        this.fName = fName;
        this.lName = lName;
        this.year = year;

    }
}
