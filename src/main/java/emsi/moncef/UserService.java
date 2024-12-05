package emsi.moncef;

import io.grpc.stub.StreamObserver;

public class UserService extends userGrpc.userImplBase {
    @Override
    public void login(User.LoginRequest request, StreamObserver<User.LoginResponse> responseObserver) {
        String username=request.getUserName();
        String password=request.getPassword();
        User.LoginResponse.Builder response= User.LoginResponse.newBuilder();
        if(username.equals(password)) {
            response.setIdResponse(0).setMsgResponse("SUCCES");
        }
        else
            response.setIdResponse(-1).setMsgResponse("NON VALIDE");
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}