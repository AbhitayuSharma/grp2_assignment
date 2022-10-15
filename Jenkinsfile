pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building for DEV enviornment..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing in DEV enviornment..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying in DEV to move to SIT....'
            }
        }
    }
}
