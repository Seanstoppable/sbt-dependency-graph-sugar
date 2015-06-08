
publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

sonatypeProfileName := "com.gilt"

pomExtra := (
  <scm>
    <url>git@github.com:gilt/sbt-dependency-graph-sugar.git</url>
    <connection>scm:git:git@github.com:gilt/sbt-dependency-graph-sugar.git</connection>
  </scm>
  <developers>
    <developer>
      <id>ebowman</id>
      <name>Eric Bowman</name>
      <url>http://twitter.com/ebowman</url>
    </developer>
    <developer>
      <id>bstjohn</id>
      <name>Brendan St John</name>
      <url>https://github.com/stjohnb</url>
    </developer>
  </developers>)