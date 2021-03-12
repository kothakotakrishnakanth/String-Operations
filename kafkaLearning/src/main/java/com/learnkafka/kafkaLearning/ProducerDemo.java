package com.learnkafka.kafkaLearning;

import java.util.Properties;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProducerDemo {
	public static void main(String[] args) {
		String bootstrapServer = "127.0.0.1:9092";
		final Logger logger = LoggerFactory.getLogger(ProducerDemo.class);
		Properties properties = new Properties();
		properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServer);
		properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
//		properties.setProperty(ProducerConfig.ACKS_CONFIG, "all");

		KafkaProducer<String, String> producer = new KafkaProducer<String, String>(properties);
		
		for(int i =0; i< 10;i++) {
			String key = "id_ "+Integer.toString(i);
			ProducerRecord<String, String> record = new ProducerRecord<String, String>("second_topic",key,
					"hello this is Lalithya Krishnakanth"+Integer.toString(i));
			// send is async operation
//			producer.send(record);
			// with callback option
			producer.send(record, new Callback() {

				public void onCompletion(RecordMetadata m, Exception e) {
//					m.UNKNOWN_PARTITION
					if (e == null) {
						logger.info("Recived metadata. \n" + "Topic" + m.topic() + "\n" + "Partition" + m.partition() + "\n"
								+ "offset " + m.offset() + "\n" + "timeStamp " + m.timestamp() + "\n");

					} else {
						logger.error("Print Error", e);
					}
				}
			});
		}
		
		// flush the data and close the conn
		producer.close();
	}
}
