# My Notes on GUI

In early versions of Java (Java 1.0), AWT (Abstract Window Toolkit) was used. AWT delegated the creation and behavior of the graphical interface to the host Operating System.  

This caused conflicts with Java’s motto *“Write once, run anywhere”*, because although the code was the same, the final visual result depended on the OS.

Starting with Java 1.2, Swing was introduced. Swing components are drawn directly inside a window, providing a consistent look and behavior across different platforms.

### Simplified hierarchy

Package `java.awt` → class `Frame` → class `JFrame` ← package `javax.swing`

## Frame characteristics

- Frames are invisible by default. Use `setVisible(true)` to display them.
- Frames start with an unusable size. Use `setSize()` to define their dimensions.
- It is important to specify what the program should do when the frame is closed.
