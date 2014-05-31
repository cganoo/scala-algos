version := "1.0.0"

scalaVersion := "2.10.4"

/**
 * Reference: https://github.com/sbt/sbt-site
 * An sbt plugin that can generate project websites
 *
 * By default, all files under src/site are included in the site
 *
 * Usage:
 *  - Run 'sbt make-site' to generate project's webpage in the target/site directory
 *  - To preview generated site, run 'sbt preview-site'
 */
site.settings

/**
 * This will default to putting the scaladoc under the latest/api directory on the website
 */
site.includeScaladoc()

/**
 * Reference: https://github.com/sbt/sbt-ghpages
 * An sbt plugin that provides support for auto-generating a project website
 * and pushing to github pages
 *
 * Usage:
 *  - Run 'sbt ghpages-push-site' to publish your website
 */
ghpages.settings

git.remoteRepo := "git@github.com:cganoo/scala-algos.git"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

javacOptions ++= Seq("-source", "1.7", "-target", "1.7")

scalacOptions in (Compile,doc) ++= Seq("-groups", "-implicits")

javacOptions in (Compile,doc) ++= Seq("-notimestamp", "-linksource")

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "1.9.1" % "test",
  "junit" % "junit" % "4.10" % "test",
  "org.slf4j" % "slf4j-api" % "1.7.5",
  "org.slf4j" % "slf4j-simple" % "1.7.5"
)

/**
 * Increase the time between polling for file changes when using continuous execution
 * */
pollInterval := 5000

tutSettings
