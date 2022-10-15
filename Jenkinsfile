pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building for SIT enviornment..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing in SIT enviornment..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying in SIT to move to UAT....'
            }
        }
    }
}
