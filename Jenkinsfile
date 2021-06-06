pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
                withMaven(maven : 'maven_3_8_1') {
                    echo "1111111111111111111111111111"
                }
            }
        }

        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'maven_3_8_1') {
                    echo "2222222222222222222222222"
                }
            }
        }


        stage ('Deployment Stage') {
            steps {
                withMaven(maven : 'maven_3_8_1') {
                    echo "33333333333333333333333"
                }
            }
        }
    }
}