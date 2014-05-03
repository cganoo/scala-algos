version := "1.0.0"

scalaVersion := "2.10.4"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

/* append several options to the list of options passed to the Java compiler */
javacOptions ++= Seq("-source", "1.7", "-target", "1.7")

scalacOptions in (Compile,doc) ++= Seq("-groups", "-implicits")

javacOptions in (Compile,doc) ++= Seq("-notimestamp", "-linksource")

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "1.9.1" % "test",
  "junit" % "junit" % "4.10" % "test",
  "org.slf4j" % "slf4j-api" % "1.7.5",
  "org.slf4j" % "slf4j-simple" % "1.7.5"
)

/* increase the time between polling for file changes when using continuous execution */
pollInterval := 5000
