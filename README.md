Chunk Oriented Processing in Spring Batch

Big Data Sets' Processing is one of the most important problem in the software world. Spring Batch is a lightweight and robust batch framework to process the data sets.

Spring Batch Framework offers 'TaskletStep Oriented' and 'Chunk Oriented' processing style. In this article, Chunk Oriented Processing Model is explained. 

Chunk Oriented Processing Feature has come with Spring Batch v2.0. It refers to reading the data one at a time, and creating 'chunks' that will be written out, within a transaction boundary. One item is read from an ItemReader, handed to an ItemProcessor, and written. Once the number of items read equals the commit interval, the entire chunk is written out via the ItemWriter, and then the transaction is committed. 

Basically, this feature should be used if at least one data item' s reading and writing is required. Otherwise, TaskletStep Oriented processing can be used if the data item' s only reading or writing is required.

Chunk Oriented Processing model exposes three important interface as ItemReader, ItemProcessor and ItemWriter via org.springframework.batch.item package.

ItemReader : This interface is used for providing the data. It reads the data which will be processed.

ItemProcessor : This interface is used for item transformation. It processes input object and transforms to output object.

ItemWriter : This interface is used for generic output operations. It writes the datas which are transformed by ItemProcessor. For example, the datas can be written to database, memory or outputstream (etc). In this sample application, we will write to database.

This project shows how to develop Chunk Oriented Processing in Spring Batch. Used Technologies : JDK 1.7.0_09, Spring 3.1.3, Spring Batch 2.1.9, Hibernate 4.1.8, Tomcat JDBC 7.0.27, MySQL 5.5.8, MySQL Connector 5.1.17 and Maven 3.0.4
