import org.apache.kafka.clients.producer.KafkaProducer

object Producer {
  val producer = new KafkaProducer[String, String](KafkaProperties.props)
}
