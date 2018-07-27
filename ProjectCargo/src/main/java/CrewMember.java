public class CrewMember {

    private String id;

    private int age;

    private String name;

    private String jobDescription;

    public String getId() {
        return id;
    }

    public CrewMember() {

    }

    public CrewMember(String id, int age, String name, String jobDescription) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.jobDescription = jobDescription;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }
}
