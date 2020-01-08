//Rhyder Quinlan
// 02/01/2020
pipeline {
    agent any
    stages {
        stage('SCM') {
            steps {
                sh 'git clone "https://github.com/rhyderQuinlan/jenkins-project.git"'
            }
        }
        stage('Build') {
            steps {
                //compile src/studentAttendance.java
                 sh 'mvn clean -f "jenkins-project"'
                 sh 'mvn compile -f "jenkins-project"'
            }
        }
        stage('Test') {
            steps {
                // run tests using maven
                // runs src/test/*
                sh 'mvn test -f "jenkins-project"'
            }
        }
        stage('Clean') {
            steps {
                deleteDir()
            }
        }
    }
}

