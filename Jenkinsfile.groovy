node {
  sh("pwd")
  shortCommit = sh(returnStdout: true, script: "git branch").trim()
}
