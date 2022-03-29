import java.util.List;

public class MetodaParametrizata {

    public static <T> void transfer(List<? extends T> src, List<? super T> dts){
        dts.addAll(src);
        src.clear();

    }
}
