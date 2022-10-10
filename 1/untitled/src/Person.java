public class Person {
    private long id;
    private String name;
    private String Birth;
    private String gender;

    public Person(long id, String name, String birth, String gender) {
        this.id = id;
        this.name = name;
        this.Birth = birth;
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return Birth;
    }

    public void setBirth(String birth) {
        Birth = birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
