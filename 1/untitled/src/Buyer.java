public class Buyer {
   private String name;
   private int age;
   private String gender;
   private String inPossession;
   private int id;

    public Buyer(String name, int age, String gender, String inPossession, int id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.inPossession = inPossession;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getInPossession() {
        return inPossession;
    }

    public void setInPossession(String inPossession) {
        this.inPossession = inPossession;
    }

    public void setId(int id) {this.id = id;}
    public int getId() {return id; }
}
