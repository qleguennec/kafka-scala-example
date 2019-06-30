import java.util.concurrent.Future

import org.apache.kafka.clients.producer.{ProducerRecord, RecordMetadata}


object RecordProducer {
  def send(key: String, value: String): Future[RecordMetadata]  = {
    val record = new ProducerRecord[String, String]("test", key, value)
    Producer.producer.send(record)
  }
}
