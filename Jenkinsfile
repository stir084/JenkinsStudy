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
        sh '''chmod +x gradlew
./gradlew clean bootJar
'''
      }
    }

    stage('deploy') {
      steps {
        sshPublisher(publishers: 
                    [
                        sshPublisherDesc(
                            configName: 'ssh', 
                            transfers: [sshTransfer(
                                cleanRemote: false, 
                                excludes: '', 
                                execCommand: 'sh /deploy/test.sh', 
                                execTimeout: 120000, flatten: false, 
                                makeEmptyDirs: false, 
                                noDefaultExcludes: false, 
                                patternSeparator: '[, ]+', 
                                remoteDirectory: '/deploy', 
                                remoteDirectorySDF: false, 
                                removePrefix: 'build/libs', 
                                sourceFiles: 'build/libs/*.jar'
                            )], 
                            usePromotionTimestamp: false, 
                            useWorkspaceInPromotion: false, 
                            verbose: true
                        )
                    ])
      }
    }

  }
}
