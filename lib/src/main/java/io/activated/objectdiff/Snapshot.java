package io.activated.objectdiff;

public interface Snapshot extends Renderable {

  Diff diff(Snapshot previous);
}
