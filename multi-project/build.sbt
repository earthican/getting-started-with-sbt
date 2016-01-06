lazy val commonSettings = Seq(
  organization := "com.example",
  version := "0.1.0",
  scalaVersion := "2.11.4"
)

lazy val root = (project in file(".")).
  aggregate(util, core)

lazy val util = (project in file ("util")).
  settings(commonSettings: _*)

lazy val core = project in file ("core").
  settings(commonSettings: _*)

