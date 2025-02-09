//Kafka Zookeeper Server Start
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
//start Kafka server
.\bin\windows\kafka-server-start.bat .\config\server.properties
//See Produced message on kafka console
.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic OrderService --from-beginning
Those are commands from start 🚀🚀........Apache Kafka..........🚀🚀
Here i created Order service and produced message by creating Producer and new Topic and message as response we can get on Kafka console.

