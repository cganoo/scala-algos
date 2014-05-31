# Pattern matching

Preamble:

```scala
case class Sup(stuff: List[String])
val sup = Sup("ick" :: "yuck" :: Nil)
```

It's (almost always) a bad idea to match on an `Option`:

```scala
def supStuff(sup: Option[Sup]): Int =
  sup match {
    case Some(s) => s.stuff.size
    case None => 0
  }

supStuff(Some(sup))
supStuff(None)
```

The `Some` case can be handled via `map`, and the `None` case can be handled via `getOrElse`:

```scala
def supStuff(sup: Option[Sup]): Int =
  sup map (_.stuff.size) getOrElse 0

supStuff(Some(sup))
supStuff(None)
```