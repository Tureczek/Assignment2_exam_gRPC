package GrpcDao;

import Domain.ExamGrpc;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import java.util.NoSuchElementException;

public class ExamGrpcDao {

    public ExamGrpc findById(int examId){
        // We use entity managers to manage our two entities.
        // We use the factory design pattern to get the entity manager.
        // Here we should provide the name of the persistence unit that we provided in the persistence.xml file.
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exam-project");
        EntityManager em = emf.createEntityManager();


        // find() tjekker db på baggrund af studentId
        // for the find method we have to provide our entity class and the id.
        ExamGrpc exam = em.find(ExamGrpc.class, examId);

        // If there is no record found with the provided student id, then we throw a NoSuchElement exception.
        if (exam == null){
            throw new NoSuchElementException("404 - No data found with Id: " + examId);
        }

        // If everything worked fine, return the result.
        return exam;
    }
}
