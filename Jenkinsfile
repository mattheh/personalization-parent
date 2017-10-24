stage('Build'){
	node('kube-aws-dev'){
		scm checkout
		sh "mvn install"
	}
}