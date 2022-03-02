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
        stage('build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('test') {
            steps {
                sh 'mvn test'
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
            mail bcc: '', body: 'TEST', cc: '', from: '', replyTo: '', subject: 'Test', to: 'alassanesall771@gmail.com'
        }
    }
}
