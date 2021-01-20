package retail_db

import org.apache.spark.{SparkConf, SparkContext}

object GetRevenuePerOrder {

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().
      setMaster(args(0)).setAppName("RevenueOrder")
    val sc= new SparkContext(conf);
    sc.setLogLevel("ERROR")
    val orderItem=sc.textFile(args(1))
    val revenuePerOrder=orderItem.map(s=> (s.split(",")(1).toInt,s.split(",")(4).toFloat)).reduceByKey(_+_).
      map(s=>s._1+","+s._2)
    revenuePerOrder.saveAsTextFile(args(2))

  }
}
