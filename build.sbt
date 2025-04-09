ThisBuild / scalaVersion := "3.6.4"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.dpratt747"
ThisBuild / organizationName := "dpratt747"

lazy val root = (project in file("."))
  .settings(
    name := "bootstrap[change name in build.sbt]",
    libraryDependencies ++= dependencies
  )

lazy val integration = (project in file("integration"))
  .dependsOn(root)
  .settings(
    publish / skip := true,
    libraryDependencies ++= testDependencies
  )

lazy val dependencies = Seq.empty[ModuleID]

lazy val testDependencies = Seq(
  "org.scalatest" %% "scalatest" % "3.2.19" % Test,
  "org.scalatestplus" %% "scalacheck-1-18" % "3.2.19.0" % Test
)