package org.zeroturnaround.jf2012.concurrency.counter;

public class VolatileCounter implements Counter {

  private volatile int counter;

  @Override
  public void run() {
    counter++;
  }

  @Override
  public int getCount() {
    return counter;
  }

}
