package Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
public class ExamGrpc {
    @Id
    private int examId;
    private int teacherId;
    private int subjectId;
    private int studentId;
    private String date;
    private int grade;
}