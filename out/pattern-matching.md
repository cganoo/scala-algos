# Pattern matching

Preamble:

```scala
scala> case class Sup(stuff: List[String])
defined class Sup

scala> val sup = Sup("ick" :: "yuck" :: Nil)
sup: Sup = Sup(List(ick, yuck))
```

It's (almost always) a bad idea to match on an `Option`:

```scala
scala> def supStuff(sup: Option[Sup]): Int =
     |   sup match {
     |     case Some(s) => s.stuff.size
     |     case None => 0
     |   }
supStuff: (sup: Option[Sup])Int

scala> supStuff(Some(sup))
res0: Int = 2

scala> supStuff(None)
res1: Int = 0
```

The `Some` case can be handled via `map`, and the `None` case can be handled via `getOrElse`:

```scala
scala> def supStuff(sup: Option[Sup]): Int =
     |   sup map (_.stuff.size) getOrElse 0
supStuff: (sup: Option[Sup])Int

scala> supStuff(Some(sup))
res2: Int = 2

scala> supStuff(None)
res3: Int = 0
```
