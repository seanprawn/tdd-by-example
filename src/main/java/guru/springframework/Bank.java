package guru.springframework;

/**
 * Created by IntelliJ IDEA.
 * User: sean
 * Date: 2022/05/01
 */
public class Bank {

  Money reduce(Expression source, String toCurrency) {
    return source.reduce(toCurrency);
  }
}
