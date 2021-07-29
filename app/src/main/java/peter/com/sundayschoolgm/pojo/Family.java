package peter.com.sundayschoolgm.pojo;

public class Family {
    private String id;
    private String name;
    private String startAgeId;
    private String endAgeID;
    private String managerID;
    private String assistantID;
    private int genderID;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartAgeId() {
        return startAgeId;
    }

    public void setStartAgeId(String startAgeId) {
        this.startAgeId = startAgeId;
    }

    public String getEndAgeID() {
        return endAgeID;
    }

    public void setEndAgeID(String endAgeID) {
        this.endAgeID = endAgeID;
    }

    public String getManagerID() {
        return managerID;
    }

    public void setManagerID(String managerID) {
        this.managerID = managerID;
    }

    public String getAssistantID() {
        return assistantID;
    }

    public void setAssistantID(String assistantID) {
        this.assistantID = assistantID;
    }

    public int getGenderID() {
        return genderID;
    }

    public void setGenderID(int genderID) {
        this.genderID = genderID;
    }
}
