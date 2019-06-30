import java.time.LocalDateTime
import java.util.{Properties, UUID}

import org.apache.kafka.clients.consumer.ConsumerConfig

object KafkaProperties {
  val props = new Properties()
  props.put("bootstrap.servers", "localhost:9092")
  props.put("key.serializer",
    "org.apache.kafka.common.serialization.StringSerializer")
  props.put("value.serializer",
    "org.apache.kafka.common.serialization.StringSerializer")

  props.put(ConsumerConfig.GROUP_ID_CONFIG, UUID.randomUUID().toString)
  props.put(ConsumerConfig.CLIENT_ID_CONFIG, "test")

  props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest")

  props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer")
  props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer")

  props.put("acks","all")
}
