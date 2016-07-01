val buildSettings = Seq(
  organization := "net.janvsmachine",
  name := "sbt-project-template",
  version := "0.0.1",
  scalaVersion  := "2.11.8",
  scalacOptions := Seq("-unchecked", "-deprecation", "-feature", "-encoding", "utf8", "-target:jvm-1.8", "-Xfatal-warnings", "-Xfuture")
)

val dependencySettings = Seq(
  libraryDependencies ++= {
    Seq(
      "org.scalatest"       %% "scalatest"    % "3.0.0-RC3" % Test,
      "org.mockito"          % "mockito-all"  % "1.10.19" % Test
    )
  }
)

val root = (project in file(".")).
  settings(buildSettings: _*).
  settings(dependencySettings: _*)
