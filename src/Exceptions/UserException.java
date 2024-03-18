package Exceptions;

public class UserException extends  Exception {
    public UserException(){
        super();
    }

    public UserException(Throwable t){
        super(t);
    }

    public UserException(String msg){
        super(msg);
    }
}
