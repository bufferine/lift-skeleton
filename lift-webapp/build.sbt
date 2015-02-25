name := "Lift skeleton website"

version := "0.0.1"

scalaVersion := "2.11.2"

resolvers ++= Seq("maven-central-repo" at "http://repo1.maven.org/maven2",
                  "snapshots"          at "http://oss.sonatype.org/content/repositories/snapshots")

resolvers ++= Seq("snapshots"     at "https://oss.sonatype.org/content/repositories/snapshots",
                  "staging"       at "https://oss.sonatype.org/content/repositories/staging",
                  "releases"      at "https://oss.sonatype.org/content/repositories/releases"
                 )


unmanagedResourceDirectories in Test <+= (baseDirectory) { _ / "src/main/webapp" }

scalacOptions ++= Seq("-deprecation", "-unchecked")

libraryDependencies ++= {
  val liftVersion = "2.6"
  Seq(
    "net.liftweb"               %% "lift-webkit"            % liftVersion           % "compile",
    "net.liftmodules"           %% "lift-jquery-module_2.6" % "2.8",
    "ch.qos.logback"             % "logback-classic"        % "1.0.6",
    "junit"                      % "junit"                  % "4.11"                % "test",
    "org.scalatest"              % "scalatest_2.11"         % "2.2.4"             % "test",
    "org.specs2"                %% "specs2"                 % "2.3.11"                % "test",
    "org.eclipse.jetty"          % "jetty-webapp"           % "8.1.7.v20120910"     % "container,test",
    "org.eclipse.jetty.orbit"    % "javax.servlet"          % "3.0.0.v201112011016" % "container,test" artifacts Artifact("javax.servlet", "jar", "jar")
  )
}

webSettings

org.scalastyle.sbt.ScalastylePlugin.Settings

ScctPlugin.instrumentSettings