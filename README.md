# Wunderman-Thompson-Practical-Assessment

please note this product was done with just creating a maven project and executing the test cases that were proivided.
there is no framework that I used for this, its just a basic maven project that will execute the JAVA files and run the test.
However if I were to make this project a bit better I would first settup a proper framework for it.

The Famework
 - I would include testNG just to ensure that we could specify multiple browsere that these test cases could run on 
 - The testNG could also help in providing the test data to the scripts, and not to hard code the test data to the test JAVA files 
 - I would seperate each test case with a different maven module project where each module has its own testNG,Porm file and and step definition file where 
   I will be calling all the funtions/scrips to execute them step by step with assertions for any failers.
 - I would have a module that will have all the shered classes. these classes will be just java file that are shared within modules these couls include page objects
   Device configuration file where I configure all the devices to execute on (browsers), listners and extent reports files that will generate reports of executions.
 - will include the spreedsheet for testdata, which the testNG will be responsible for retriving data from to the script.
 - I would have a file for all the element funtionalities, In this file I would precode the the functions that I will need to execute so that I do not code the
   click fuction for every page object for example. I would have fuctions such at scrolling, sendkeys etc. pre-coded so I just call them on the page objects.
   
   
   TO EXECUTE THE PROJECT THAT I HAVE
   
   -  for now this only execute on chrome, but more browsers could have been added for a proper framework
   -  just runn the files under the package src/test/java.
   -  selenium is included through maven dependances
  
