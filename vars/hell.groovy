def buildApp() {
    echo "Building Docker image..."
       sh 'docker build -t nginx:latest .'
}

def testApp() {
    echo "Test step"
}

def deployApp() {
    echo "Deploy step"
}
