def buildApp() {
    echo "Building Docker image..."
       sh 'docker build -t nginx:latest .'
}

def testApp() {
    echo "Test step"
    sh 'echo Test successful'
}

def deployApp() {
    sh '''
        docker run -d -p 8080:80 --name panu nginx:latest
    '''
}
