# aws-spot-calculator
https://docs.google.com/document/d/1YED-mUN6uNbClHCi6DbKl0HOe4LwLfZrBdbs8u3WhoM/edit?usp=sharing
## spotOffers:
an api for getting spot offers meeting criteria for different interruption behaviors
### parameters:
* maxCpu - max number of cpus 
* maxMemory - max memory size (GB)
* maxStorage - max storage size (GB)
* maxNetwork - network traffic size (GBs)
* typeCategory - category of the instance type (General Purpose,Compute Optimized, Memory Optimized,Accelerated Computing,Storage Optimized)
* OS - instance operating system (Linux,Windows)
### result
A list of estimated prices for instance types. 

Each offer has the type name, OS, on demand hourly price, historic spot hourly price, total estimated hourly price including other aws services (EBS,S3,CloudWatch).
The list is sorted by total estimated price.

The list is divided into the following interruption behaviors:
* termination
* stop
* hibernation
  
