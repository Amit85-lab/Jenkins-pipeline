def buildApp() {
    echo "Building Docker image..."
        sh 'docker build -t myimage:latest multifunction/'
}

def testApp() {
    echo "Test step"
}

def deployApp() {
    echo "Deploy step"
}
