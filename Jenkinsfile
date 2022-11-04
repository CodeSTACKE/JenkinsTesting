pipeline {
    agent any
    stages {
        stage('build'){
            steps {
                sh '''
                        cd ./JenkingsTesting
                        ./mvnw -DskipTests clean compile
                   '''
                 }
        }

        stage ('test') {
            steps {
               sh  '''
                     cd JenkingsTesting
                        ./mvnw test
                    '''
            }
        }

        stage('deliver') {
            steps {
                sh '''
                     cd JenkingsTesting
                        ./mvnw -DskipTests install

                 '''
            }
        }

        }
    }


