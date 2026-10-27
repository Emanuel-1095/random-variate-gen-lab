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
    if (stdDev <= 0) {
      throw new IllegalArgumentException("Rate parameter 'stdDev' must be greater than zero");
    }

    this.mean = mean;
    this.standardDeviation = stdDev;
    this.randomGenerator = RandomGenerator.getDefault();
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
    if (randomGenerator == null) {
      throw new NullPointerException("Random generator cannot be null");
    }
    if (stdDev <= 0) {
      throw new IllegalArgumentException("Rate parameter 'stdDev' must be greater than zero");
    }
    
    this.mean = mean;
    this.standardDeviation = stdDev;
    this.randomGenerator = randomGenerator;

  }
  // Consultar sobre la implementación
  @Override
  public Double sample() {
    return mean + standardDeviation * randomGenerator.nextGaussian();
  }
}
