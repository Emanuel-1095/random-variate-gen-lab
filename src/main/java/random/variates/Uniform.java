package random.variates;

import java.util.random.RandomGenerator;

/**
 * Represents a continuous uniform probability distribution.
 *
 * <p>All values in the interval {@code [a, b)} have the same probability density.
 */
public final class Uniform implements Distribution<Double> {

  /** The lower bound of the distribution. */
  private final double a;

  /** The upper bound of the distribution. */
  private final double b;

  /** The random number generator used to generate samples. */
  private final RandomGenerator randomGenerator;

  /**
   * Creates a uniform distribution using the default random generator.
   *
   * @param a the lower bound of the distribution; must be less than {@code b}
   * @param b the upper bound of the distribution; must be greater than {@code a}
   * @throws IllegalArgumentException if {@code a} is greater than or equal to {@code b}
   */
  public Uniform(double a, double b) {
    if (a >= b) {
      throw new IllegalArgumentException("Lower bound 'a' must be less than upper bound 'b'");
    }
    this.a = a;
    this.b = b;
    this.randomGenerator = new java.util.Random();
  }

  /**
   * Creates a uniform distribution using the specified random generator.
   *
   * @param a the lower bound of the distribution; must be less than {@code b}
   * @param b the upper bound of the distribution; must be greater than {@code a}
   * @param randomGenerator the random number generator used to generate samples
   * @throws IllegalArgumentException if {@code a} is greater than or equal to {@code b}
   * @throws NullPointerException if {@code randomGenerator} is {@code null}
   */
  public Uniform(double a, double b, RandomGenerator randomGenerator) {
    if (randomGenerator == null) {
      throw new NullPointerException("Random generator cannot be null");
    }
    if (a >= b) {
      throw new IllegalArgumentException("Lower bound 'a' must be less than upper bound 'b'");
    }

    this.a = a;
    this.b = b;
    this.randomGenerator = randomGenerator;
  }

  @Override
  public Double sample() {
    return a + (b - a) * randomGenerator.nextDouble();
  }
}
