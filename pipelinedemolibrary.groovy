pipeline {
    agent any

    stages {
        stage('clone') {
            steps {
                git 'https://github.com/Shreenivas123/Javawebapp.git'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
