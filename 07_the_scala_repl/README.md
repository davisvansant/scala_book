### The Scala REPL

```
> scala                                                                                                          
Welcome to Scala 2.13.1 (OpenJDK 64-Bit Server VM, Java 13.0.2).
Type in expressions for evaluation. Or try :help.

scala>
```

```
scala> val x = 1
x: Int = 1

scala> val y = x + 1
y: Int = 2
```

```
scala> 2 + 2
res0: Int = 4

scala> 3 / 3
res1: Int = 1
```

```
scala> val z = res0 + res1
z: Int = 5
```
```
scala> val name = "John Doe"
name: String = John Doe

scala> "hello".head
res2: Char = h

scala> "hello".tail
res3: String = ello

scala> "hello, world".take(5)
res4: String = hello

scala> println("hi")
hi

scala> 1 + 2 * 3
res6: Int = 7

scala> (1 + 2) * 3
res7: Int = 9

scala> if (2 > 1) println("greater") else println("lesser")
greater
```
