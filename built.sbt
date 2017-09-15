name := "signal-collect-minimal"

version := "8.0.7"

organization in ThisBuild := "com.signalcollect"

scalaVersion in ThisBuild := "2.12.3"

cancelable in Global := true

parallelExecution in Test := false

scalacOptions in ThisBuild ++= Seq(
  "-Ywarn-unused-import",
  "-feature",
  "-optimize",
  "-unchecked",
  "-deprecation",
  "-Xlint:-adapted-args"
)

libraryDependencies ++= {
  Seq(
   "com.iheart" %% "ficus" % "1.4.2",
   "org.json4s" %% "json4s-native" % "3.5.3",
   "org.java-websocket" % "Java-WebSocket" % "1.3.4",
   "org.webjars" % "d3js" % "4.10.2",
   "org.webjars" % "jquery" % "3.2.1",
   "org.webjars" % "reconnecting-websocket" % "1.0.0",
   "org.webjars" % "intro.js" % "1.0.0",
   "org.scala-lang" % "scala-reflect" % "2.12.3",
   "com.typesafe.akka" %% "akka-actor" % "2.5.4",
   "com.typesafe.akka" %% "akka-cluster" % "2.5.4",
   "com.typesafe.akka" %% "akka-remote" % "2.5.4",
   "com.typesafe.akka" %% "akka-testkit" % "2.5.4" % Test,
   "com.novocode" % "junit-interface" % "0.11" % Test,
   "org.scalatest" %% "scalatest" % "3.0.1" % Test,
   "org.scalacheck" %% "scalacheck" % "1.13.4" % Test,
   "org.easymock" % "easymock" % "3.4" % Test
  )
}

resolvers ++= Seq(
  "Scala-Tools Repository" at "https://oss.sonatype.org/content/groups/scala-tools/",
  "Maven Central Server" at "http://repo1.maven.org/maven2"
)

