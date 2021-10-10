package Client;

import com.examApplication.stub.exam.ExamGRpcRequest;
import com.examApplication.stub.exam.ExamGRpcResponse;
import com.examApplication.stub.exam.ExamGRpcServiceGrpc;
import io.grpc.Channel;

import java.util.ArrayList;
import java.util.List;

public class ExamGrpcClient {
    private ExamGRpcServiceGrpc.ExamGRpcServiceBlockingStub examGRpcServiceBlockingStub;

    public ExamGrpcClient(Channel channel) {
        examGRpcServiceBlockingStub = ExamGRpcServiceGrpc.newBlockingStub(channel);
    }

    public List<String> getResult(long examId) {
        //Creating the request object
        ExamGRpcRequest examGRpcRequest = ExamGRpcRequest.newBuilder().setExamId(examId).build();
        // Getting Response back
        ExamGRpcResponse examGRpcResponse = examGRpcServiceBlockingStub.getExamInfo(examGRpcRequest);

        // Send it to the caller in an appropriate manner, in this case, a list.
        List<String> result = new ArrayList<>();
        result.add(examGRpcResponse.getDate());
        result.add(examGRpcResponse.getGrade());
        return result;
    }

}
