node {
    stage('Build') {
        sh 'mvn -B clean package -DskipTests'
    }
    stage('Test') {
        sh 'mvn test'
    }
}
