package random.variates;

import java.util.Map;
import java.util.random.RandomGenerator;

/**
 * Represents a discrete empirical probability distribution.
 *
 * @param <T> the type of values produced by this distribution
 */
public final class Discrete<T> implements Distribution<T> {

  /**
   * Associates each possible value with its probability.
   *
   * <p>The probabilities must be non-negative and must sum to one.
   */
  private final Map<T, Double> table;

  /** The random number generator used to generate samples. */
  private final RandomGenerator randomGenerator;

  /**
   * Creates a discrete empirical distribution using the default random generator.
   *
   * @param table the values and their associated probabilities
   */
  public Discrete(Map<T, Double> table) {
    throw new UnsupportedOperationException("Unimplemented constructor 'Discrete'");
  }

  /**
   * Creates a discrete empirical distribution using the specified random generator.
   *
   * @param table the values and their associated probabilities
   * @param random the random number generator
   */
  public Discrete(Map<T, Double> table, RandomGenerator randomGenerator) {
    throw new UnsupportedOperationException("Unimplemented constructor 'Discrete'");
  }

  @Override
  public T sample() {
    throw new UnsupportedOperationException("Unimplemented method 'sample'");
  }
}
