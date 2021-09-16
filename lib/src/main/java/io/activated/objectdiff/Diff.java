package io.activated.objectdiff;

import java.io.IOException;
import java.io.Writer;

public interface Diff extends Renderable {

  Diff CLEAR = w -> w.write("<cleared>");
}
