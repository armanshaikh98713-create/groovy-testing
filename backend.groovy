pipeline {
    agent any

    tools{
        maven 'maven3.9'
        jdk 'Java21'
    }

    stages {
        stage('Code Pull') {
            steps {
                git branch: 'main', url: 'https://github.com/armanshaikh98713-create/Java-backend.git'
            }
        }
        stage('Building Code') {
            steps{
                sh 'mvn clean package'
            }
            
        }
    }
}