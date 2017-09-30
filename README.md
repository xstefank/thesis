
# Use of Transactions within a Reactive Microservices Environment

The reactive microservice architecture is a trending architectural pattern nowadays. However, synchronous calls between services are not a good practice in such an architectural context. The goals of the thesis are to investigate the use of transactions within a reactive microservices environment, looking at patterns such as the Saga transaction pattern, and how they can fit in the context of a message driven system. 

The expected tasks foreseen in the thesis:

* Review the state of the art, in terms of problems of synchronous/blocking approaches for transaction management and other approaches/patterns available - taking into account the microservices context;

* Propose a proof-of-concept implementation, preferably using the Narayana transaction manager and prepare a service capable to manage transactions in the context of reactive microservices;    

* Prepare an example/quickstart showing the whole issues in more practical terms, proving that the transaction manager can work in an asynchronous environment;

More details about the thesis: 
[https://issues.jboss.org/browse/JBTM-2920](https://issues.jboss.org/browse/JBTM-2920)




