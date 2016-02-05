
To use in command line mode:

    java  -jar  org.gramar.maven.gramar.jar  options



where options can be:

  model=<file-name>  workspace=<directory-name>

      applies the org.gramar.maven.gramar gramar to the given model 
      and writes the results to the specified directory.
      
  list-samples

      lists all of the deployed sample models, giving name and description
      
  sample-name=<model-name>
  
      writes the specified model to the console.  Use >> to write to a text file 
