pipeline {
    agent any
    
    environment {
        GIT_CREDENTIALS = credentials('ADirin')
    }
    
    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', credentialsId: 'ADirin', url: 'https://github.com/ADirin/FarToCel_Fall2024.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}
