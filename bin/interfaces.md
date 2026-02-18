# My notes on interfaces

## Definition

Interfaces are a set of guidelines that classes must follow, similar to abstract classes.  
Classes can inherit/implement an interface. This means that if the interface contains a series of guidelines, the class must respect them.  
When we talk about guidelines, we mean methods.  

In summary, interfaces define the behaviors that classes must implement.

## Characteristics of interfaces

There are predefined interfaces, which are part of the API, as well as custom interfaces that we create ourselves.  
Both share the same characteristics.  

We know that interfaces can only contain abstract methods and constant data, not variables.

## Important points

* Interfaces are stored in a `.class` file  
* They cannot be instantiated (no use of `new`)  
* All their methods are `public` and `abstract`. They are not implemented. If the access modifiers `public` and `abstract` are not explicitly written, they are applied by default  
* They do not have variables, only constants  

## Why not use abstract classes?

We know that Java does not allow multiple inheritance, only single inheritance.  
With interfaces, we can simulate multiple inheritance by allowing a class, in addition to inheriting from its parent class, to also implement interfaces that define the guidelines it must follow.

### Code example

	class Boss extends Employee implements Interface1, Interface2
	
#### Another code example.
        
        // Here we are applying the substitution principle to instantiate the interface. 
        
        Employee commercialDirector = new Manager ("Sandra", 80000, 2012, 05, 05);
        
        Comparable example = new Employee ("Elizabeth", 8000,2011,06,07);
        
        if (commercialDirector instanceof Employee) {
        	System.out.println("It's a manager");
        }
        if (example instanceof Comparable) {
        	System.out.println("It implements the Comparable interface");
        }
        
