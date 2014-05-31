resolvers += "jgit-repo" at "http://download.eclipse.org/jgit/maven"

resolvers += Resolver.url(
  "tpolecat-sbt-plugin-releases",
    url("http://dl.bintray.com/content/tpolecat/sbt-plugin-releases"))(
        Resolver.ivyStylePatterns)

addSbtPlugin("org.tpolecat" % "tut-plugin" % "0.2.1")

addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "0.6.2")

addSbtPlugin("com.typesafe.sbt" % "sbt-site" % "0.7.2")

addSbtPlugin("com.typesafe.sbt" % "sbt-ghpages" % "0.5.2")
