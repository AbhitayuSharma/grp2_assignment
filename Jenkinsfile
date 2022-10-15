pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building for UAT enviornment..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing in UAT enviornment..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying in UAT to move to PROD....'
            }
        }
    }
}
