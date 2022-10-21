package io.activated.objectdiff;

public interface Diff extends Renderable {

  Diff CLEAR = w -> w.write("<cleared>");
}
