import java.util.ArrayList;

public class Person {
    // composition
    private Education education;
    private ArrayList<Education> educations = new ArrayList<>();
    private Work work;
    private ArrayList<Work> works = new ArrayList<>();
    private Skill skill;

    private String name;
    private String email;

    public Person() {

    }

    public Person(String name, String email) {
        this.name = name;
        this.email = email;

//      this.education = new Education();
        //education.setDegree("Math");

//        this.work = new Work();
//        this.skill = new Skill();
    }

    public String getDegree() {
        return education.getDegree();
    }

    public Education getEducation() {
        return education;
    }

    public ArrayList<Education> getEducations() {
        return educations;
    }

    public void setEducation(ArrayList<Education> educations) {
        this.educations = educations;
    }

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }

    public ArrayList<Work> getWorks() {
        return works;
    }

    public void setWorks(ArrayList<Work> works) {
        this.works = works;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return education.toString() + "\n" +
                work.toString() + "\n" +
                skill.toString();
    }
}
