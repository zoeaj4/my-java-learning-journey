# My notes on access modifiers

Access modifiers determine from where a class, attribute, or method can be accessed. They are used to apply encapsulation.

In Java, there are four access modifiers:

	public
It can be accessed from anywhere in the program, even from other packages.

	private
It can only be accessed from within the same class. No other class can access it directly.

	default (no keyword)
It can only be accessed within the same package.
No keyword is written; I simply leave it without an access modifier.

	protected
It can be accessed from the same package and from child classes (subclasses), even if they are in a different package.

Why are access modifiers necessary?

Because without them any class could modify anything, it would be easy to break my program, I would lose control over my data, my code would become fragile.

Access modifiers allow me to:

protect information

prevent errors

organize my program better