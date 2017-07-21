package chapter4.varianta.nineteen.exception;
/**
 *
 * @author Sukhocheva Maryana
 */
public class PhotoException extends Exception{
    public PhotoException()    {
    }

    public PhotoException(String msg) {
        System.err.println(msg);

    }

  
 }
