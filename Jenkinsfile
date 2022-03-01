pipeline {
    agent any
    tools {
        maven 'maven123'
    }
    stages {
        stage('Get maven version from pom') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}
