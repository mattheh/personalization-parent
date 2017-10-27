buildDeployService {
	email = "ecomm-architecture@officedepot.com"
    platform  = "generic"
    namespace = "eai"
    context = "external"
    initialDelaySeconds = "180"
    timeoutSeconds = "5"
    healthUri = "/"
	buildCommands = [
	         		"mvn install --settings /etc/maven/settings.xml -Dmaven.test.skip=true"
	         		]
}
