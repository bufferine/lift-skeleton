resolvers ++= Seq("snapshots"               at "http://oss.sonatype.org/content/repositories/snapshots",
                  "maven-central-repo"      at "http://repo1.maven.org/maven2",
                  "sbt-idea-repo"           at "http://mpeltonen.github.com/maven",
                  "Templemore Repository"   at "http://templemore.co.uk/repo")

resolvers ++= Seq("snapshots"     at "https://oss.sonatype.org/content/repositories/snapshots",
                  "staging"       at "https://oss.sonatype.org/content/repositories/staging",
                  "releases"      at "https://oss.sonatype.org/content/repositories/releases"
                 )


//Enable the sbt web plugin
addSbtPlugin("com.earldouglas" % "xsbt-web-plugin" % "0.7.0")

// Plugin for scalastyle
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.3.2")

addSbtPlugin("com.sqality.scct" % "sbt-scct" % "0.3.1-SNAPSHOT")

// Plugin for Cucumber
addSbtPlugin("templemore" % "sbt-cucumber-plugin" % "0.8.0")