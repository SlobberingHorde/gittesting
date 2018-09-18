node {
  sh(returnStdout: true, script: "pwd")
  shortCommit = sh(returnStdout: true, script: "git branch").trim()
}
