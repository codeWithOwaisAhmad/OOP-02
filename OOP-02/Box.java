class Box extends Rectangle {
  private double height;

  public Box() {
      height = 0;
  }

  public Box(double l, double w, double h) {
      super.setDimension(l, w);
      setDimension(h);
  }

  public double getVolume() {
      return getLength() * getWidth() * height;
  }

  public void setDimension(double h) {
      if (h >= 0) height = h;
      else height = 0;
  }

  public String toString() {
      return ("Length: " + getLength() + " Width: " + getWidth() + " Height: " + height);
  }
  public double getHeight() {
      return height;
  }
}
