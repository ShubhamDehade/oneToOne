package bean;

import javax.persistence.*;

@Entity
@Table(name = "laptop")
public class Laptop {
    @Id
    @Column(name = "laptop_id")
    private int lId;
    @Column(name = "laptop_name")
    private String lName;
    @OneToOne
    @JoinColumn(name = "student_ref")
    private Student stud_ref;

    public int getlId() {
        return lId;
    }

    public void setlId(int lId) {
        this.lId = lId;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Student getStud_ref() {
        return stud_ref;
    }

    public void setStud_ref(Student stud_ref) {
        this.stud_ref = stud_ref;
    }
}
