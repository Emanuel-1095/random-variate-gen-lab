package random.variates;

import java.util.random.RandomGenerator;

/**
 * Represents an exponential probability distribution.
 *
 * <p>The distribution is parameterized by its rate {@code lambda}.
 */
public final class Exponential implements Distribution<Double> {

  /** The rate parameter of the exponential distribution; must be greater than zero. */
  private final double lambda;

  /** The random number generator used to produce random samples. */
  private final RandomGenerator randomGenerator;

  /**
   * Creates an exponential distribution with the specified rate parameter using a default random
   * number generator.
   *
   * <p>The rate parameter must be strictly greater than zero.
   *
   * @param lambda the rate parameter of the distribution; must be greater than zero
   * @throws IllegalArgumentException if {@code lambda} is less than or equal to zero
   */
  public Exponential(double lambda) {
    if (lambda <= 0) {
      throw new IllegalArgumentException("Rate parameter 'lambda' must be greater than zero");
    }

    this.lambda = lambda;
    this.randomGenerator = RandomGenerator.getDefault();
  }

  /**
   * Creates an exponential distribution with the specified rate parameter and random number
   * generator.
   *
   * <p>The rate parameter must be strictly greater than zero.
   *
   * @param lambda the rate parameter of the distribution; must be greater than zero
   * @param randomGenerator the random number generator used to generate samples
   * @throws IllegalArgumentException if {@code lambda} is less than or equal to zero
   * @throws NullPointerException if {@code randomGenerator} is {@code null}
   */
  public Exponential(double lambda, RandomGenerator randomGenerator) {
    if (randomGenerator == null) {
      throw new NullPointerException("Random generator cannot be null");
    }
    if (lambda <= 0) {
      throw new IllegalArgumentException("Rate parameter 'lambda' must be greater than zero");
    }

    this.lambda = lambda;
    this.randomGenerator = randomGenerator;
  }

  @Override
  public Double sample() {
    double u = randomGenerator.nextDouble();
    return -Math.log(1 - u) / lambda;
  }
}
