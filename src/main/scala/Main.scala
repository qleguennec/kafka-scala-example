import java.util.Collections

import org.apache.kafka.clients.consumer.KafkaConsumer

object Main {
  def main(args: Array[String]): Unit = {
    val consumer = new KafkaConsumer[String, String](KafkaProperties.props)
    consumer subscribe Collections.singletonList("test")

    while (true) {
      val records = consumer poll 100
      records forEach(record => {
        println("found record", record.topic(), record.key(), record.value())
      })
    }

    consumer close()
  }
}
