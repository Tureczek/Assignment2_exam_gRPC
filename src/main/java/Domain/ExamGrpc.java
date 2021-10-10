package Domain;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
@ToString
public class ExamGrpc {
    @Id
    private int examId;
    private int teacherId;
    private int subjectId;
    private int studentId;
    private String date;
    private String grade;

    public ExamGrpc() {
    }

    public ExamGrpc(int examId, int teacherId, int subjectId, int studentId, String date, String grade) {
        this.examId = examId;
        this.teacherId = teacherId;
        this.subjectId = subjectId;
        this.studentId = studentId;
        this.date = date;
        this.grade = grade;
    }

    public int getExamId() {
        return examId;
    }

    public void setExamId(int examId) {
        this.examId = examId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
