# aws-spot-calculator
## spotOffers:
an api for getting spot offers meeting criteria for different interruption behaviors
### parameters:
* cpu - number of cpus requierd
* memory - instane memory requierment (GB)
* storage - storage requierment (GB)
* network - network traffic size (GB)
### result
a list of instances divided into the following interruption behaviors:
* termination
* stop
* hibernation
each offer has the type name, OS, on demand hourly price, historic spot hourly price, total estemited hourly price including other aws services (EBS,S3,CloudWatch)  
