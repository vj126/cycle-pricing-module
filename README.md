Cycle pricing module
---

A fully working Maven project that calculate the price of cycle as per the component variant.


To build it, you will need to download and unpack the latest (or recent) version of Maven (https://maven.apache.org/download.cgi)
and put the `mvn` command on your path.
Then, you will need to install a Java 1.8 (or higher) JDK (not JRE!), and make sure you can run `java` from the command line.
Now you can run `mvn clean install` and Maven will compile your project, 
an put the results it in a jar file in the `target` directory.


# Installation

Once you have configured your project in your IDE you can build it from there. However if you prefer you can use maven from the command line. In that case you could be interested in this short list of commands:

* `mvn clean install`: it will download the dependancies and compile the code. Also it will run all the junit


#Code infomation and hierarchy

Following is the hierarchy of the classes

CycleManager
|
|__	List of CycleAssembly

	 CycleAssembly
	 |
	 |__List of Component

	 	Component
	 	|__component name
	 	|__component type
	 	|__List of Part

		 	Part
		 	|__part name
		 	|__part price

`PricingEngine` is responsible for actula price calculation of cycles using multithreading.


`DataGenerator.get1000Cycles()` is responsible for creating the 1000 Cycle.
`PricingEngineTests` will create 1000 cycle test data and will calculate pricing using multithreading and blocking queue using a maximum of 10 threads.

