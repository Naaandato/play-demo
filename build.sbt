name := """example-app"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.2"

libraryDependencies += guice

enablePlugins(DebianPlugin)
maintainer := "naaandato <naaandato@gmail.com>"
packageSummary := "My custom package"
packageDescription := "Package"

