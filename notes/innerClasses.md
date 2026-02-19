# My Notes on Inner Classes

As the name suggests, inner classes are classes that are defined inside another class.

They are commonly used to improve encapsulation and to logically group classes that are only relevant within the context of another class.

---

## Why Are Inner Classes Needed?

Inner classes are useful for several reasons:

- They can access the private fields of the outer class without using accessor methods (getters or setters).

- They help hide implementation details from other classes in the same package, providing better encapsulation.

- They are useful when only one class needs access to the instance fields of another class.

- They are often used in event handling and callback mechanisms (for example, when implementing interfaces like `ActionListener`).

---

## Local Inner Classes

Local inner classes are classes that are defined inside a method.

They are typically used when a class is needed only within a single method and nowhere else.

---

### When and Why Are They Used?

Local inner classes are useful when:

- The class is only instantiated once.

- The goal is to simplify the code by keeping related logic inside a single method.

- The class should not be visible outside the method where it is declared.

Their scope is strictly limited to the method in which they are defined.

---

### Advantages

- They provide stronger encapsulation. Not even the outer class can directly access them. Only the method in which they are declared can use them.

- They help keep the code cleaner and more organized.

- They reduce unnecessary exposure of classes that are not meant to be reused elsewhere.

---

#### Example

```java
class OuterClass {

    public void myMethod() {

        class LocalInnerClass {
            // code of the local inner class
        }

        // code of the method
    }

    // code of the outer class
}
