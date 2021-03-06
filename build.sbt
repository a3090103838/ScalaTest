name := "scala_examples"

version := "0.0.1"

organization := "com.umeng" 

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")

resolvers ++= Seq(
  "Umeng Public Maven Repository" at "http://122.11.52.227:8088/nexus/content/groups/public",
  "clojars.org" at "http://clojars.org/repo"
)

libraryDependencies ++= {
  val finagleVersion = "6.5.2"
  Seq(
	    "com.twitter" %% "util-core" % "6.3.8"
  ) 
}
