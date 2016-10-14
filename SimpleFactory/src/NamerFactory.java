/**
 * Created by zongjunq on 10/14/2016.
 */
public class NamerFactory {
    //Factory decides which class to return based on
//presence of a comma
    public Namer getNamer(String entry) {
//comma determines name order
        int i = entry.indexOf(",");
        if (i > 0)
            return new LastFirst(entry);
        else
            return new FirstFirst(entry);
    }
}
