package random.variates;

import java.util.random.RandomGenerator;

/**
 * Represents a continuous normal probability distribution.
 *
 * <p>The distribution is defined by its mean and standard deviation.
 */
public final class Normal implements Distribution<Double> {

  /** The mean of the distribution. */
  private final double mean;

  /** The standard deviation of the distribution. */
  private final double standardDeviation;

  /** The random number generator used to generate samples. */
  private final RandomGenerator randomGenerator;

  /**
   * Creates a normal distribution using the default random generator.
   *
   * @param mean the mean of the distribution
   * @param stdDev the standard deviation of the distribution; must be greater than zero
   * @throws IllegalArgumentException if {@code stdDev} is less than or equal to zero
   */
  public Normal(double mean, double stdDev) {
    throw new UnsupportedOperationException("Unimplemented constructor 'Normal'");
  }

  /**
   * Creates a normal distribution using the specified random generator.
   *
   * @param mean the mean of the distribution
   * @param stdDev the standard deviation of the distribution; must be greater than zero
   * @param randomGenerator the random number generator used to generate samples
   * @throws IllegalArgumentException if {@code stdDev} is less than or equal to zero
   * @throws NullPointerException if {@code randomGenerator} is {@code null}
   */
  public Normal(double mean, double stdDev, RandomGenerator randomGenerator) {
    throw new UnsupportedOperationException("Unimplemented constructor 'Normal'");
  }

  @Override
  public Double sample() {
    throw new UnsupportedOperationException("Unimplemented method 'sample'");
  }
}
