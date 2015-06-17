import com.github.play2war.plugin._

name := "homehess.carsharing"

version := "1.0-SNAPSHOT"

//war

Play2WarPlugin.play2WarSettings

Play2WarKeys.servletVersion := "3.1"


lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
    javaCore withSources(),
    cache withSources(),
    javaJdbc withSources(),
    javaEbean withSources(),
    filters withSources(),
    "mysql" % "mysql-connector-java" % "5.1.34"
)