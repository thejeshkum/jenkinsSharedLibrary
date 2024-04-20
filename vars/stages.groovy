def call ( String stageName){
  if ("${stageName}" == "Build")
  {
  sh "mvn clean packages"  
  }
  else if ("${stageName}" == "SonarQube Report")
  {
    sh "mvn clean sonar:sonar"
  }
  
} 
