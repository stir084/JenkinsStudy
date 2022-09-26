pipeline {
  agent any
  stages {
    stage('source') {
      steps {
        git(url: 'https://github.com/stir084/JenkinsStudy.git', branch: 'master', credentialsId: 'stir084')
      }
    }

    stage('build') {
      steps {
        sh '''echo \'start bootJar\' 
chmod +x gradlew
./gradlew clean bootJar
'''
      }
    }

    stage('deploy') {
      steps {
        sh 'echo "hi"'
      }
    }

  }
}