package com.diffblue.javademo.primitivestruct;

public class Struct {

  private int x;
  private float y;
  private boolean z;

  public Struct(int _x, float _y) {
    x = _x;
    y = _y;
  }

  public void setz(boolean _z) {
    z = _z;
  }

  public void check() {
    if(x == 5 && y == 10.0 && z)
      x++;
  }

}
