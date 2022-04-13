pipeline {
    agent any
    tools {
        maven 'maven32'
    }
    stages {
        stage('Get maven version from pom') {
            steps {
                sh 'mvn --version'
            }
        }
        stage('build') {
            steps {
                sh 'mvn clean install'
            }
        }
      
        stage('package') {
            steps {
                sh 'mvn package -DskipTests' 
            }
        }
    }
    post {
        always {
            archiveArtifacts artifacts: 'target/*.jar'
            junit 'target/surefire-reports/**/*.xml'
        }
    }
}
