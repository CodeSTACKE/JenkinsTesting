pipeline {
    agent any
    stages {
        stage('build'){
            steps {
                sh '''
                        cd ./TestPipeline
                        ./mvnw -DskipTests clean compile
                   '''
                 }
        }

        stage ('test') {
            steps {
               sh  '''
                     cd TestPipeline
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


