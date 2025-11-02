import java.io.*;
import java.util.*;

class takeuforward {
  public static int countWords(String str) {
    int n = str.length();
    int spaces = 0;
    for (int i = 0; i < n; i++) {
      if (str.charAt(i) == ' ')
        spaces = spaces + 1;
    }
    return spaces+1;
  }
}
