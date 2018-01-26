lazy val root = (project in file("."))
  .settings(
    name := "printTweets",
    scalaVersion := "2.11.8",
    version := "0.1.0",
    resolvers += Resolver.mavenLocal,
    libraryDependencies ++= Seq(
      "org.apache.spark" %% "spark-core" % "1.5.2", // 2.2.1
      "org.apache.spark" %% "spark-streaming" % "1.5.2", // 2.2.1
      "org.apache.spark" %% "spark-streaming-twitter" % "1.5.2", // 1.6.3
      "org.twitter4j" % "twitter4j-core" % "3.0.3", // 4.0.6
      "org.twitter4j" % "twitter4j-stream" % "3.0.3" // 4.0.6
    )
  )

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}