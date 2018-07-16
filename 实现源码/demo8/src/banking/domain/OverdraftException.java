package banking.domain;

/**
 * Created by Administrator on 2018/7/16 0016.
 */
public class OverdraftException extends Exception{
    private double deficit;

    public double getDeficit() {
        return deficit;
    }

    public OverdraftException(String message, double deficit) {
        super(message);
        this.deficit = deficit;
    }
}