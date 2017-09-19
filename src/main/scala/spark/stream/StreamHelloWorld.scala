package spark.stream

import org.apache.spark.{SparkConf}
import org.apache.spark.streaming.{Seconds, StreamingContext}
//nc -lk 7777
object StreamHelloWorld {
  private final val port = 7777;

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("Stream Hello World").setMaster("local")
    val ssc = new StreamingContext(conf, Seconds(1))
    val lines = ssc.socketTextStream("localhost", port)
    val errorLines = lines.filter(_.contains("error"))

    //errorLines.print()
    errorLines.saveAsTextFiles("stream", "txt")

    ssc.start()
    ssc.awaitTermination()
  }
}
