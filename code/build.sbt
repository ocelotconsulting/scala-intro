organization := "rga"

name := "scala-examples"

scalaVersion := "2.12.3"

scalacOptions := Seq("-unchecked", "-feature", "-deprecation", "-encoding", "utf8")

libraryDependencies ++=
    Seq(
      "org.scalatest" %% "scalatest" % "3.0.0" % Test
    )

mainClass := Some("examples.Operators")