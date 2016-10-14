/**
 * Created by zongjunq on 10/14/2016.
 */
public class Driver {
    public static void main(String[] args) {
        NamerFactory nf = new NamerFactory();
        Namer namer = nf.getNamer("Zongjun Qi");
        System.out.println("Firstname:" + namer.getFirst());
        System.out.println("Lastname:" + namer.getLast());

        namer = nf.getNamer("Qi,Zongjun");
        System.out.println("Firstname:" + namer.getFirst());
        System.out.println("Lastname:" + namer.getLast());
    }
}
