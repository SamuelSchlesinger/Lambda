# Lambda

A small Java library of generic functional-interface stubs (`Function1` through `Function4`) for higher-order programming. It was written around 2015, before Java 8 introduced `java.util.function`, to provide a lightweight way to pass functions as first-class values in Java projects targeting earlier JVM versions.

## Interfaces

Each interface declares a single `lambda` method that takes typed parameters and returns a typed result:

| Interface | Method signature |
|---|---|
| `Function1<R, P1>` | `R lambda(P1 param)` |
| `Function2<R, P1, P2>` | `R lambda(P1 param1, P2 param2)` |
| `Function3<R, P1, P2, P3>` | `R lambda(P1 param1, P2 param2, P3 param3)` |
| `Function4<R, P1, P2, P3, P4>` | `R lambda(P1 param1, P2 param2, P3 param3, P4 param4)` |

## Usage

Implement an interface with an anonymous class (pre-Java-8 style):

```java
Function1<Integer, Integer> square = new Function1<Integer, Integer>() {
    public Integer lambda(Integer param) {
        return param * param;
    }
};

System.out.println(square.lambda(5)); // 25
```

On Java 8+, the same interface can be implemented with a lambda expression:

```java
Function1<Integer, Integer> square = param -> param * param;
```

## Java 8+ Note

If you are targeting Java 8 or later, prefer the built-in `java.util.function.*` interfaces (`Function`, `BiFunction`, etc.) over this library. They are part of the standard library, support composition helpers, and cover the common arities without an extra dependency.
