def newGit(repo)
{
  git "${repo}"
}
def newMaven()
{
  sh 'mvn package'
}
def newDeployment(ip,appname)
{
  deploy adapters: [tomcat9(credentialsId: 'bdc997f0-20fd-4058-a0b6-f5b404b678ec', path: '', url: "${ip}")], contextPath: "${appname}", war: '**/*.war'
}
def newTest(jobname)
{
  sh "java -jar /home/ubuntu/.jenkins/workspace/${jobname}/testing.jar"
}
def newDelivery(ip,appname)
{
   deploy adapters: [tomcat9(credentialsId: 'ea02b6de-cb1b-4b09-a6e1-e199550877e5', path: '', url: "${ip}")], contextPath: "${appname}", war: '**/*.war'
}
  


  
