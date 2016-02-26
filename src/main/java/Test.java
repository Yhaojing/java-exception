import com.haojing.exception.BaseException;
import com.haojing.exception.CommonErrors;

/**
 * Created by hnzb on 16/2/26.
 * 抛出异常,在外层调用test方法的地方catch住,一般都是在controller层catch其他地方直接抛出异常即可
 */
public class Test {
    public void test() {
        BaseException.raise(CommonErrors.SUCCESS);
    }
}
