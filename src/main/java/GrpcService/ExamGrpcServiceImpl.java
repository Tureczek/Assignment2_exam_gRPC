package GrpcService;

import Domain.ExamGrpc;
import GrpcDao.ExamGrpcDao;
import com.examApplication.stub.exam.Exam;
import com.examApplication.stub.exam.ExamGRpcRequest;
import com.examApplication.stub.exam.ExamGRpcResponse;
import com.examApplication.stub.exam.ExamGRpcServiceGrpc;
import com.google.protobuf.Empty;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class ExamGrpcServiceImpl extends ExamGRpcServiceGrpc.ExamGRpcServiceImplBase {

    private static final Logger logger = Logger.getLogger(ExamGrpcServiceImpl.class.getName());

    // Data access object that fetches data from the db and returns it
    private ExamGrpcDao examGrpcDao = new ExamGrpcDao();

        Map<Integer, ExamGrpc> examMap;

    @Override
    public void getExamById(ExamGRpcRequest request, StreamObserver<ExamGRpcResponse> responseObserver){
        int examId = (int) request.getExamId();

        try{
            ExamGrpc examGrpc = examGrpcDao.findById(examId);

            ExamGRpcResponse examGRpcResponse = ExamGRpcResponse.newBuilder()
                    .setExamId(examId)
                    .setTeacherId(examGrpc.getTeacherId()) //Using Getters from target folder
                    .setSubjectId(examGrpc.getSubjectId()) //Using Getters from target folder
                    .setStudentId(examGrpc.getStudentId())
                    .setDate(examGrpc.getDate())
                    .setGrade(examGrpc.getGrade())
                    .build();

            responseObserver.onNext(examGRpcResponse); // This send the data to port 8081 so bloom can fetch the data
            responseObserver.onCompleted();
        } catch (NoSuchElementException e){
            logger.log(Level.SEVERE, "NO DATA FOUND WITH THE EXAM ID: " + examId);

            // If some error occurs with status not_found
            responseObserver.onError(Status.NOT_FOUND.asRuntimeException());

        }
    }
}
