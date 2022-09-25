pipeline {
  agent any
  stages {
    stage('source') {
      steps {
        git(url: 'https://github.com/stir084/JenkinsStudy.git', branch: '*/master', credentialsId: 'stir084')
      }
    }

  }
}