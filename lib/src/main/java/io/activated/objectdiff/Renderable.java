package io.activated.objectdiff;

import java.io.IOException;
import java.io.Writer;

public interface Renderable {
  void render(Writer w) throws IOException;
}
