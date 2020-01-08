
pipeline {
    agent any
    stages {
        stage('Fetch') {
            steps {
                sh 'git clone "https://github.com/rhyderQuinlan/jenkins-project.git"'
            }
        }
        stage('Build') {
            steps {
                 sh 'mvn clean -f "jenkins-project"'
                 sh 'mvn compile -f "jenkins-project"'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test -f "jenkins-project"'
            }
        }
        stage('Cleanup') {
            steps {
                deleteDir()
            }
        }
    }
}