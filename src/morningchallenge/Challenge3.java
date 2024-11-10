package morningchallenge;

public class Challenge3 {
    int eId, deptNo;
    String eName, job;

    Challenge3(int eId, String eName, int deptNo, String job) {
        this.eId = eId;
        this.deptNo = deptNo;
        this.eName = eName;
        this.job = job;

    }


    public void display() {
        System.out.println(eId);
        System.out.println(eName);
        System.out.println(deptNo);
        System.out.println(job);
    }

    public static void main(String[] args) {
        Challenge3 emp1 = new Challenge3(101, "john", 10, "Manual tester");
        Challenge3 emp2 = new Challenge3(102, "Smith", 11, "Autpmation Tester");
        emp1.display();
        emp2.display();
    }
}
