
lazy val common = Seq(
  version := "1.0.0",
  scalaVersion := "2.13.1",
  organization := "Basov",
  libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test
)

lazy val root = project
  .in(file("."))
  .aggregate(lab1, lab2, lab3, lab4)
  .settings(common)

lazy val lab1 = project
  .settings(common)

lazy val lab2 = project
  .settings(common)

lazy val lab3 = project
  .settings(common)

lazy val lab4 = project
  .settings(common)


coverageMinimum := 70

coverageFailOnMinimum := false

coverageHighlighting := true

publishArtifact in Test := false

parallelExecution in Test := false
