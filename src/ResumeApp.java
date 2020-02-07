import java.util.ArrayList;
import java.util.Scanner;

public class ResumeApp {
    public static void main(String[] args) {
        ArrayList<Education> educations = new ArrayList<>();
        ArrayList<Work> works = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your email: ");
        String email = sc.nextLine();

        Person person = new Person(name, email);
        Education education = new Education();

        System.out.print("How many degrees do you have? ");
        int numDegrees = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numDegrees; i++) {
            System.out.print("Degree: ");
            String degree = sc.nextLine();
            System.out.print("Major: ");
            String major = sc.nextLine();
            System.out.print("University Name: ");
            String uniName = sc.nextLine();
            System.out.print("Graduation Year: ");
            String gradYear = sc.nextLine();
            education = new Education(degree, major, uniName, gradYear);
            educations.add(education);
        }

        person.setEducation(educations);

        Work work;
        System.out.print("How many work experiences do you have? ");
        int numWorks = sc.nextInt();
        sc.nextLine();

        ArrayList<String> descriptions;

        for (int i = 0; i < numWorks; i++) {
            descriptions = new ArrayList<>();
            work = new Work();
            System.out.print("Company: ");
            String company = sc.nextLine();
            System.out.print("Job Title: ");
            String title = sc.nextLine();
            System.out.print("Start Date: ");
            String startDate = sc.nextLine();
            System.out.print("End Date: ");
            String endDate = sc.nextLine();
            System.out.print("How many duties? ");
            int numDuties = sc.nextInt();
            sc.nextLine();

            for (int j = 0; j < numDuties; j++) {
                //sc.nextLine();
                System.out.print("Duty: ");
                String description = sc.nextLine();
                descriptions.add(description);
                work.setDescription(descriptions);
                work = new Work(company, title, startDate, endDate, descriptions);
            }

            works.add(work);
        }

        ArrayList<Skill> skills = new ArrayList<>();
        Skill skill;

        System.out.print("How many skills do you have (Enter at least 3) ");
        int numSkills = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numSkills; i++) {
            System.out.print("Enter a skill: ");
            String skillName = sc.nextLine();
            System.out.print("Rating: ");
            String rating = sc.nextLine();
            skill = new Skill();
            skill.setName(skillName);

            while (!skill.getRatings().contains(rating)) {
                System.out.println("Invalid, try again.");
                System.out.print("Rating: ");
                rating = sc.nextLine();
            }
            skill.setRating(rating);
            skills.add(skill);
        }

        System.out.println();
        System.out.println();
        System.out.println("=============================================================");

        System.out.println(person.getName());
        System.out.println(person.getEmail());
        System.out.println();

        System.out.println("Education");
        for (Education edu : educations) {
            System.out.println(edu);
            System.out.println();
        }

        System.out.println("Experience");
        for (Work work1 : works) {
            System.out.println(work1);
        }

        System.out.println("Skills");
        for (Skill skill1 : skills) {
            System.out.println(skill1);
        }
    }
}
