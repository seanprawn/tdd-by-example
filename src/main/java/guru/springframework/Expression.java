package guru.springframework;

/**
 * Created by IntelliJ IDEA.
 * User: sean
 * Date: 2022/05/01
 */
public interface Expression {
  Money reduce(Bank bank, String to);
  Expression plus(Expression addend);
  Expression times(int multiplier);

}
