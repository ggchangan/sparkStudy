package spark

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by ggchangan on 17-6-19.
  */
object SparkHelloWorld {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("HelloWorld").setMaster("local")
    val sc = new SparkContext(conf)
    val words = sc.parallelize(Seq("i", "love", "to", "study", "spark"));
    val count = words.count();
    println(count)
  }
}
