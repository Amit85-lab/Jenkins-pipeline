def buildApp() {
    echo "Building Docker image..."
       docker build -t nginx:latest .'
}

def testApp() {
    echo "Test step"
}

def deployApp() {
    echo "Deploy step"
}
