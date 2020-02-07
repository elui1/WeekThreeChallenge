import java.util.ArrayList;

public class Work {
    private String company;
    private String title;
    private String startDate;
    private String endDate;
    private ArrayList<String> description;


    public Work() {

    }

    public Work(String company, String title, String startDate, String endDate, ArrayList<String> description) {
        this.company = company;
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public ArrayList<String> getDescription() {
        return description;
    }

    public void setDescription(ArrayList<String> description) {
        this.description = description;
    }

    public String toString() {
        String desc = "";
        for (int i = 0; i < description.size(); i++) {
            desc += "Duty " + (i + 1) + ", " + description.get(i) + "\n";
        }

        return  this.title + "\n" +
                this.company + ", " +
                this.startDate + " - " +
                this.endDate + "\n" +
                desc;
    }
}
